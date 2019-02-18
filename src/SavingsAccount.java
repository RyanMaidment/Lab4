
public class SavingsAccount extends BankAccount {

	protected double interestRate = 1 + rnd.nextInt(5);

	@Override
	public String toString() {
		return "SavingsAccount Interest rate = " + this.interestRate + ", " + super.toString() + " ";
	}

	@Override
	public void calculateAndUpdateBalance() {
		this.balance -= interestRate / 100;
	}

}
