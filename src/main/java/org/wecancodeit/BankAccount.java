package org.wecancodeit; //bridge project Mod 3 homework

public class BankAccount {

	private String accountNumber;
	private String accountType;
	private int balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public int getBalance() {
		return balance;
	}

	public BankAccount(String accountNumberPar, String accountTypePar, int balancePar) { // constructor
		this.accountNumber = accountNumberPar;
		this.accountType = accountTypePar;
		this.balance = balancePar;

	}

	public void withdraw(int amount) {
		balance -= amount;
	}

	public void deposit(int amount) {
		balance += amount;

	}

}
