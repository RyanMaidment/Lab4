import java.util.Random;

public class SavingsAccount extends BankAccount {
	Random rnd = new Random();
	
	private double interestRate = 2+rnd.nextInt(10);


	public SavingsAccount() {
	}

	public String toString() {

		String interestRate = super.toString() + ""+this.interestRate+"";
		
		return interestRate;

	}
	
	@Override
	public void calculateAndUpdateBalance() {
		this.balance -= interestRate/100;
	}

}
