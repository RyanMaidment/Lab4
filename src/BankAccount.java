import java.util.Random;

abstract class BankAccount {
	
	Random rnd = new Random();
	protected double balance = 20+rnd.nextInt(100);
	private long accountNo;
	private static int numAccounts;

	
	public String toString() {
		return ""+this.balance+"";
	}

	public double getBalance() {
		return balance;
	}

	abstract public void calculateAndUpdateBalance();

}
