
public class ChequingAccount extends BankAccount {

	protected double fee = 1 + rnd.nextInt(5);

	@Override
	public String toString() {
		return "Chequing Account: Fee = " + df.format(fee) + ", " + super.toString() + " ";
	}

	@Override
	public void calculateAndUpdateBalance() {
		this.balance -= fee;
	}

}
