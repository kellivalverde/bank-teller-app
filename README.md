# Bank Teller

Objective
Design a banking application that handles standard interaction that a user would have with their bank.

Design a Account class that will handle instances of a bank account.
Design a Bank class that will house multiple accounts the user may have.
Design a BankApplication (with a main method) to build a user interface where your user can access their accounts and perform standard transactions.
Tasks

The Account Class should have:

3 instance variables to handle String accountNumber, String accountType, and double accountBalance (Note the accountNumber will be a unique identifier)
Create a constructor that accepts input for your three instance variables
Create accessor methods for each instance variable in Account
Create a deposit method for adding funds
Create a withdrawal method for retrieving funds.
Create a checkAccountBalance method to show available funds
The Bank Class should have:

A Map called accounts
A getAllAccounts() method to return a Collection<Account> containing all accounts
An openNewAccount() to add an Account to accounts
A getAccount(String accountNumber) to get access a particular Account
A closeAccount(String accountNumber) to close a particular Account
Hint: This Class operates like a bank and keeps track of multiple bank accounts.

The BankingApp should have:

A Bank object
Two unique Account objects properly instantiated
Add your Accounts to your Bank objects Map
Set up a UI to give the user the ability to interact with the application:
Display Accounts and their info.
Display a menu to give your users choices to:
Make a deposit to an Account
Make a withdrawal from an Account
Check the balance on an Account
Close an Account
Exit the application
Accept input from the users choice and display the appropriate response
Include a loop so the user can continue to manipulate accounts
Stretch Task #1: Include a security system that requires the user to enter a correct PIN (Personal Identification Number) before they can access the application. (Think about the most appropriate place to house this information)

Stretch Task #2: Refuse to close an account that still has remaining funds. Let the user know they can’t remove an account that has funds remaining and prompt them to make another choice.

