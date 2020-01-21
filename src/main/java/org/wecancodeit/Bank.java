package org.wecancodeit; //bridge project Mod 3 homework

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	Map<String, BankAccount> accounts = new HashMap<>();

	public void add(BankAccount account) {
		accounts.put(account.getAccountNumber(), account); // calling an accessor
	}

//	public void add(String accountType) {
//	BankAccount 	
//		
//		accounts.put(accountType, account); // calling an accessor
//	}

	public BankAccount findAccount(String accountNum) {
		return accounts.get(accountNum);
	}

	public Collection<BankAccount> getAllAccounts() {
		return accounts.values();
	}

	public void close(BankAccount account) {
		accounts.remove(account.getAccountNumber(), account);
	}

	public void withdraw(String accountNumber, int amount) {
		BankAccount withdrawFromAccont = findAccount(accountNumber);
		withdrawFromAccont.withdraw(amount);

	}

	public void deposit(String accountNumber, int amount) {
		BankAccount depositIntoAccont = findAccount(accountNumber);
		depositIntoAccont.deposit(amount);
	}

//	public BankAccount findAccountType(String string) {
//		return accounts.get(accountType);
//		;
//	}

}
