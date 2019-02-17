import java.util.Random;

public class ChequingAccount extends BankAccount {
	
	Random rnd = new Random();
	private double fee = 1+rnd.nextInt(5);

	public String toString() {
		
		String fee = super.toString() + ""+this.fee+"";
		
		return fee;

	}

	@Override
	public void calculateAndUpdateBalance() {
		this.balance -= fee;
	}

}
