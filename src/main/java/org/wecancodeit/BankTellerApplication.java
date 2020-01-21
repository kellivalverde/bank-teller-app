package org.wecancodeit;

import java.util.Scanner;

public class BankTellerApplication {

	public static void main(String[] args) {

		Bank bank = new Bank();

		BankAccount checkingAccount = new BankAccount("1111", "Checking", 3000);
		BankAccount savingsAccount = new BankAccount("2222", "Savings", 5000);

		bank.add(checkingAccount);
		bank.add(savingsAccount);

		Scanner input = new Scanner(System.in);

		// could reuse Pin app

		System.out.println("Welcome to the Bank!");

		System.out.println("What would you like to do?");
		printMenu();

		String menuOption = "";

		while (true) {

			System.out.println("\nHere is the information for your accounts:");

			for (BankAccount currentAccount : bank.getAllAccounts()) {
				System.out.println(currentAccount.getAccountNumber() + "   " + currentAccount.getAccountType() + "   "
						+ currentAccount.getBalance());
			}

			System.out.println("\nSelect an option to continue:");
			
			menuOption = input.nextLine();

			if (menuOption.contentEquals("help")) {
				printMenu();
				continue;

			} else if (menuOption.contentEquals("5")) {
				System.out.println("You have exited. Thank you for banking with us today! Goodbye.");
				System.exit(0);

			} else if (menuOption.contentEquals("1")) {

				System.out.println("Which account? ");
				String accountToAddDeposit = input.nextLine();
				BankAccount currentAccount = bank.findAccount(accountToAddDeposit);

				System.out.println("Enter deposit amount: ");
				int depositAmount = input.nextInt();
				currentAccount.deposit(depositAmount);

			} else if (menuOption.contentEquals("2")) {

				System.out.println("Which account? ");
				String accountToWithdrawFrom = input.nextLine();
				BankAccount currentAccount = bank.findAccount(accountToWithdrawFrom);

				System.out.println("Enter withdraw amount: ");
				int withdrawAmount = input.nextInt();
				currentAccount.withdraw(withdrawAmount);

			} else if (menuOption.contentEquals("3")) {
				System.out.println("Which account? ");
				String whichBalance = input.nextLine();
				BankAccount currentAccount = bank.findAccount(whichBalance);

				System.out.println("Your balance for that account is: " + currentAccount.getBalance());

			} else if (menuOption.contentEquals("4")) {

				System.out.println("Which account? ");
				String accountToClose = input.nextLine();
				BankAccount currentAccount = bank.findAccount(accountToClose);

				bank.close(currentAccount);
			}

		}

	}

	public static void printMenu() {

		System.out.println("Press 1 to Make a Deposit");
		System.out.println("Press 2 to Make a Withdraw");
		System.out.println("Press 3 to Check the Balance of an Account");
		System.out.println("Press 4 to Close an Account");
		System.out.println("Press 5 to Exit");

		System.out.println("To see menu, type \"help\".");

	}
}
