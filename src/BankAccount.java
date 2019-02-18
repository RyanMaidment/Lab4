import java.text.DecimalFormat;
import java.util.Random;

abstract class BankAccount {
	DecimalFormat df = new DecimalFormat("$###.##");
	Random rnd = new Random();
	protected double balance = 20 + rnd.nextInt(100);
	private long accountNo = rnd.nextLong();
	private static int numAccounts;

	public String toString() {
		return "Balance = " + df.format(getBalance()) + ", Account Number = " + this.accountNo;
	}

	public double getBalance() {
		return balance;
	}

	abstract public void calculateAndUpdateBalance();

}
