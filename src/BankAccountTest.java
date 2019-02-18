/*
*Name: Ryan Maidment
*Student ID: 040932067
*Course& Section: CST8132_310
*Assignment: Lab 4
*Date: Feb 17, 2019
*/
import java.text.DecimalFormat;
/**
 * This program creates 3 chequing accounts and 2 savings accounts.
 * Generating random numbers for the varibles. It creates and prints
 * 12 months of the bank account being minipulated by the fees and 
 * interest.
 * @author maid0017
 * @version 1.0
 * @since 2019/02/17
 */
public class BankAccountTest {

	BankAccount[] accounts;
/**
 * This default constuctor is used to create and initialize 3
 * chequing and 2 savings accounts. It creates an array of BankAccount
 * called accounts.
 */
	public BankAccountTest() {

		accounts = new BankAccount[5];

		for (int i = 0; i < 5; i++) { //for-loop to create 5 accounts.

			if (i < 3) {
				accounts[i] = new ChequingAccount();  //creates 3 chequing accounts
			} else if (i > 2) {
				accounts[i] = new SavingsAccount(); //creates 2 savings accounts
			}
		}
	}

	/**
	 * This method uses a for-each loop to loop through the accounts array
	 * and call on the calulateAndUpdateBalance method to update the accounts
	 * balances with the fees and interest rates.
	 */
	public void monthlyProcess() {
		for (BankAccount account : accounts) {	   //for each loop, looping through the elemnts of the accounts array.
			account.calculateAndUpdateBalance();
		}
	}

	/**
	 * This method displays the accounts using a for loop.
	 * It uses the super class toString method to print out
	 * all the sub-class and super class toStrings.
	 */
	public void display() {
		DecimalFormat df = new DecimalFormat("$###.##");

		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].toString()); //prints BankAccounts toString.
		}

		System.out.println();

	}

	/**
	 * This main method creates a BankAccountTest object called
	 * bank and uses it to call on the display method and monthlyProcess methods.
	 * It uses a for loop to print out 12 months.
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccountTest bank = new BankAccountTest();

		System.out.println("Beginning Account Balances: ");
		bank.display();

		for (int i = 1; i < 13; i++) {
			System.out.println("Month " + i + " Account Balances: ");
			bank.monthlyProcess();
			bank.display();
		}
	}
}
