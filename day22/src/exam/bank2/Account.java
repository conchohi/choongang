package exam.bank2;

import java.text.DecimalFormat;

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
	
	//#3. 메소드
	
	//toString() 오버라이딩
	@Override
	public String toString() {
		return accountNo + ", " + owner + ", " + balance;
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
		DecimalFormat f = new DecimalFormat("#,##0원");
		System.out.println(accountNo + "\t" + owner + "\t" + f.format(balance));
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}
