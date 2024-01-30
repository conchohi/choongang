package day21.exam.bank;

import java.util.Scanner;

public class BankApplication {
	//Scanner 객체 생성
	private static Scanner sc = new Scanner(System.in);
	//계좌를 담을 배열 - 모든 메소드에서 공통으로 사용
	private static Account[] accounts = new Account[100];
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("=================================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("=================================");
			System.out.print("선택 > ");
			
			int option = Integer.parseInt(sc.nextLine());
			
			if(option == 1) {
				System.out.println("-----------");
				System.out.println("계좌 생성");
				System.out.println("-----------");
				
				System.out.print("계좌번호 : ");
				String accountNumber = sc.nextLine();
				System.out.print("계좌주 : ");
				String owner = sc.nextLine();
				System.out.print("초기입금액 : ");
				int balance = Integer.parseInt(sc.nextLine());
				
				Account newAccount = new Account(accountNumber, owner, balance);
				createAccount(newAccount);
			} else if (option == 2) {
				System.out.println("-----------");
				System.out.println("계좌목록");
				System.out.println("-----------");
				
				accountList();
			} else if (option == 3) {
				System.out.println("-----------");
				System.out.println("예금");
				System.out.println("-----------");
				System.out.print("계좌번호 : ");
				String accountNumber = sc.nextLine();
				System.out.print("예금액 : ");
				int amount = Integer.parseInt(sc.nextLine());
				
				deposit(accountNumber, amount);
			} else if (option == 4) {
				System.out.println("-----------");
				System.out.println("출금");
				System.out.println("-----------");
				System.out.print("계좌번호 : ");
				String accountNumber = sc.nextLine();
				System.out.print("출금액 : ");
				int amount = Integer.parseInt(sc.nextLine());
				
				withdraw(accountNumber, amount);
			} else if(option == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("1 ~ 5까지 숫자 중 하나를 입력하세요.");
			}
		}//end of while
		sc.close();
		
	}//end of main
	
	//1.계좌 생성
	private static void createAccount(Account account) {
		int idx = getEmptyIndex();
		
		if(idx == -1) {
			System.out.println("더이상 계좌를 생성할 수 없습니다.");
		} else {
			accounts[idx] = account;
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
	}
	
	//2. 계좌 리스트
	private static void accountList() {
		System.out.println("계좌번호\t계좌주\t잔액");
		System.out.println("=====================");
		for(int i = 0; i < getEmptyIndex(); i++) {
			accounts[i].showInfo();
		}
	}
	
	//3.예금
	private static void deposit(String AccountNumber, int amount) {
		Account account = findAccount(AccountNumber);
		
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		} else {
			account.deposit(amount);;
		}
	}
	
	//4.출금
	private static void withdraw(String AccountNumber, int amount) {
		Account account = findAccount(AccountNumber);
		
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		} else {
			account.withdraw(amount);
		}
	}
	
	private static int getEmptyIndex() {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	
	private static Account findAccount(String accountNumber) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i].getAccountNo().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
	

}
