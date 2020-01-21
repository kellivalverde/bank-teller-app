package org.wecancodeit;  //bridge project Mod 3 homework

import static org.hamcrest.CoreMatchers.is;  //like is equal to
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

	Bank underTest;
	BankAccount account1;
	BankAccount account2;
//	String accountType1;
	// will go into App class

	@Before
	public void setUp() { // method that sets up project so you can have objects for your test
		underTest = new Bank();
		account1 = new BankAccount("1", "Checking", 100); // Object - builds a constructor
		account2 = new BankAccount("2", "Savings", 150); // Object - builds a constructor

	}

	@Test
	public void shouldBeAbleToAddAccount() {
		underTest.add(account1);
		BankAccount retrievedAccount = underTest.findAccount("1");
		assertThat(retrievedAccount, is(account1));

	}

	@Test
	public void shouldBeAbleToAddTwoAccounts() {
		underTest.add(account1);
		underTest.add(account2);

		Collection<BankAccount> allAccounts = underTest.getAllAccounts();
		//assertThat(allAccounts, containsInAnyOrder(account1,account2));
		assertEquals(2, allAccounts.size());

	}

//	@Test
//	public void shoudBeAbleToAddAccountType() {
//		String accountType1 = "Checking";
//		underTest.add(accountType1);
//		BankAccount retrievedAccountType = underTest.findAccountType("Checking");
//		assertThat(retrievedAccountType, is(accountType1));
//	}
	
	@Test
	public void shouldBeAbleToCloseAnAccount() {
		underTest.add(account1);	
		underTest.close(account1);

		BankAccount retrievedAccount = underTest.findAccount(account1.getAccountNumber()); //calls accessor
		assertThat(retrievedAccount, is(nullValue()));
	}

	@Test
	public void shouldWithdrawFromAccount() {
		underTest.add(account1);	
		underTest.withdraw(account1.getAccountNumber(), 50);
		assertThat(account1.getBalance(), is(50));
		
		
	}
	@Test
	public void shouldDepositToAccount() {
		underTest.add(account2);	
		underTest.deposit(account2.getAccountNumber(), 50);
		assertThat(account2.getBalance(), is(200));
		
	}
	
	
}
