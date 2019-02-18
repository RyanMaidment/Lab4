import java.text.DecimalFormat;

public class BankAccountTest {

	BankAccount[] accounts;

	public BankAccountTest() {

		accounts = new BankAccount[5];

		for (int i = 0; i < 5; i++) {

			if (i < 3) {
				accounts[i] = new ChequingAccount();
			} else if (i > 2) {
				accounts[i] = new SavingsAccount();
			}
		}
	}

	public void monthlyProcess(BankAccount[] accounts) {
		for (BankAccount account : accounts) {
			account.calculateAndUpdateBalance();
		}
	}

	public void display() {
		DecimalFormat df = new DecimalFormat("$###.##");

		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].toString());
		}

		System.out.println();

	}

	public static void main(String[] args) {
		BankAccountTest bank = new BankAccountTest();

		System.out.println("Beginning Account Balances: ");
		bank.display();

		for (int i = 1; i < 13; i++) {
			System.out.println("Month " + i + " Account Balances: ");
			bank.monthlyProcess(bank.accounts);
			bank.display();
		}
	}
}
