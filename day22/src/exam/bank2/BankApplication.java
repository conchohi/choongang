package exam.bank2;

import java.util.Scanner;

public class BankApplication {
	//Scanner 객체 생성
	private static Scanner sc = new Scanner(System.in);
	//계좌를 담을 배열 - 모든 메소드에서 공통으로 사용
	private static Account[] accounts = new Account[100];
	
	//메인 메소드
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("=================================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("=================================");
			System.out.print("선택 > ");
			
			int listSelectNo = Integer.parseInt(sc.nextLine());
			
			if(listSelectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			switch(listSelectNo) {
			case 1 : //계좌 생성
				createAccount();
				break;
			case 2 : //계좌목록
				accountList();
				break;
			case 3 : //예금
				deposit();
				break;
			case 4 : //출금
				withdraw();
				break;
			default : //그외
				System.out.println("1 ~ 5 사이 숫자를 입력하세요");
				break;
			}
		}//end of while
		
	}//end of main
	
	//1.계좌 생성
	private static void createAccount() {
		//1-1. 입력받을 계좌번호, 계좌주, 초기금액을 담을 변수
		String accountNumber = null;
		String owner = null;
		int balance = 0;
		
		//1-2. 데이터 입력받기
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호 : ");
		accountNumber = sc.nextLine();
		System.out.print("계좌주 : ");
		owner = sc.nextLine();
		System.out.print("초기입금액 : ");
		balance = Integer.parseInt(sc.nextLine());
		
		//1) 입력된 내용을 이용해서 Account 배열에 저장하기 위해서는 객체 생성이 필요
		Account account = new Account(accountNumber, owner, balance); //한 사람의 자료
		
		//2) 비어있는 배열 공간을 찾아서 1)에서 만든 객체 담기 - for문, if문, break
		for(int i = 0; i < accounts.length; i++) {
			//빈 공간을 찾으면 입력받은 객체를 생성해서 저장
			if(accounts[i] == null) {
				accounts[i] = account;
				System.out.println("결과 : " + owner + "님 계좌가 생성되었습니다.");
				//이미 객체를 생성해서 담았으니 반복문을 빠져나감
				// = 빈 공간을 찾았으면 그곳에 새로 생성된 계좌 객체를 담고 계좌 생성 작업을 빠져나감 
				break;
			}
		}
	}
	
	//2. 계좌 리스트
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		System.out.println("계좌번호\t계좌주\t잔액");
		System.out.println("=====================");
		//for문, 계좌가 있는 것만 출력(!=null) : if
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				break;
			}
			accounts[i].showInfo();
			// = System.out.printf("%s\t%s\t%d", accounts[i].getAcccountNo, accounts[i].getOwner(), accounts[i].getBalacne());
		}//end of for
		System.out.println();
	}
	
	//3.예금
	private static void deposit() {
		//3-1. 계좌가 있는지 확인 - findAccount(String accountNo)
				//	   계좌번호를 찾기 위해 매개값(인자)으로 계좌번호를 넘겨줌 
				//	   찾는 계좌가 있으면 찾는 계좌에 대한 정보를 가져오면 됨
				//	   없으면 계좌가 없습니다 출력, 있으면 누적
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
	
		//3-2. 계좌를 찾기 위해서 계좌번호 입력받기
		System.out.print("계좌번호 : ");
		String accountNumber = sc.nextLine(); //입력 계좌번호, 지역변수
		
		//계좌 찾기
		//계좌번호가 없으면 -> 없다고 메세지, 있으면 계좌를 리턴받기 
		Account account = findAccount(accountNumber);
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		} else {
			//입금액 입력 받기
			System.out.print("예금액 : ");//입력 예금액, 지역변수
			int amount = Integer.parseInt(sc.nextLine());
			account.deposit(amount);;
//			account.setBalance(account.getBalance() + amount);
			System.out.println(account.getOwner() + "님 " + amount + "원 예금했습니다." );
		}
		System.out.println();
	}
	
	//4.출금
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		String accountNumber = sc.nextLine();
		
		Account account = findAccount(accountNumber);
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		} else {
			System.out.print("출금액 : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			account.withdraw(amount);
			System.out.println(account.getOwner() + "님 " + amount + "원 출금했습니다." );
			System.out.println("잔액 : " + account.getBalance() + "원");
		}
		System.out.println();
		
	}
	
	private static Account findAccount(String accountNumber) {
		//계좌찾기 - 배열 전체를 살펴보기 (for), 계좌가 생성되어있는 배열만 찾기( != nill )
		//		   계좌가 있다면 지금 찾는 것과 같은지 비교 - equals
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) { //계좌 있는 부분만 찾기
				break;
			}
			else if(accounts[i].getAccountNo().equals(accountNumber)) {
				return accounts[i];//계좌정보 리턴하기
			}
		}
		return null;
	}
	

}
