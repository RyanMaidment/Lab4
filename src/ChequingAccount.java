/*
*Name: Ryan Maidment
*Student ID: 040932067
*Course& Section: CST8132_310
*Assignment: Lab 4
*Date: Feb 17, 2019
*/
/**
 * This class creates a sub-class of BankAccount.
 * That initializes a fee. Has a toString
 * that prints the fee and parent class toString.
 * Has a method that calculates and updates accounts balance
 * by subtracting the fee.
 * @author maid0017
 * @version 1.0
 * @since 2019/02/17
 */
public class ChequingAccount extends BankAccount {

	protected double fee = 1 + rnd.nextInt(5); //generates a fee between 1-5 dollars.

	/* 
	 * This returns fee and BankAccounts toString method.
	 * @see BankAccount#toString()
	 * @returns fee and super.toString
	 */
	@Override
	public String toString() {
		return "Chequing Account: Fee = " + df.format(fee) + ", " + super.toString() + " ";
	}

	/* 
	 * This caluclates and updates account balance
	 * by subtracting the fee.
	 * @see BankAccount#calculateAndUpdateBalance()
	 */
	@Override
	public void calculateAndUpdateBalance() {
		this.balance -= fee;
	}

}
