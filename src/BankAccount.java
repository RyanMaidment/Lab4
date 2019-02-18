/*
*Name: Ryan Maidment
*Student ID: 040932067
*Course& Section: CST8132_310
*Assignment: Lab 4
*Date: Feb 17, 2019
*/
import java.text.DecimalFormat;
import java.util.Random;

/**
 * This is an abstract super class. That initialized a balance and
 * an account number. It creates a toString that prints Balance and account number.
 * Has a method that gets and returns balance and has an abstract method that is minipulated
 * by the sub-classes ChequingAccount and SavingsAccount.
 * @author maid0017
 * @version 1.0
 * @since 2019/02/17
 */
abstract class BankAccount {
	DecimalFormat df = new DecimalFormat("$###.##");
	Random rnd = new Random();
	protected double balance = 20 + rnd.nextInt(100); //generates random number between 20 and 100.
	private long accountNo = rnd.nextLong(); //generates long number.
	private static int numAccounts;

	/**
	 * This returns balance, and account number. 
	 * @see java.lang.Object#toString()
	 * @return getbalance and accountNo
	 * 
	 */
	public String toString() {
		return "Balance = " + df.format(getBalance()) + ", Account Number = " + this.accountNo;
	}

	/**
	 * Gets and returns account balance.
	 * @returns balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * This abstract method is used to calculate and update the account balances.
	 * Both methods are used in the child classes ChequingAccount and SavingsAccount.
	 */
	abstract public void calculateAndUpdateBalance();

}
