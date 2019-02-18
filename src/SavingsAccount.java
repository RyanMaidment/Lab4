/*
*Name: Ryan Maidment
*Student ID: 040932067
*Course& Section: CST8132_310
*Assignment: Lab 4
*Date: Feb 17, 2019
*/
/**
 * @author maid0017
 * @version 1.0
 * @since 2019/02/17
 */
public class SavingsAccount extends BankAccount {

	protected double interestRate = 1 + rnd.nextInt(5); //made interest rate whole numbers to generate a propor int.

	/**
	 * This returns interest rate and BankAccounts toString. 
	 * @see BankAccount#toString()
	 * @returns interestRate and super.toString()
	 */
	
	@Override
	public String toString() {
		return "SavingsAccount Interest rate = " + this.interestRate + ", " + super.toString() + " ";
	}

	/**
	 *This caluclates and updates account balance
	 *by subtracting the interestRate.
	 * @see BankAccount#calculateAndUpdateBalance()
	 */
	@Override
	public void calculateAndUpdateBalance() {
		this.balance -= interestRate / 100;  // interest rate divided by 100 because it moves the demcimal place 2 spaces.
	}

}
