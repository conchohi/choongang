package day21.exam.bank;

public class Account {
	//#1. 필드
	private String accountNo; //계좌번호
	private String owner; //계좌주
	private int balance; //예금액
	
	//#2. 생성자
	public Account(String accountNo, String owner, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("출금이 성공되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void showInfo() {
		System.out.println(accountNo + "\t" + owner + "\t" + balance);
	}
	
	public String getAccountNumber() {
		return accountNo;
	}
}
