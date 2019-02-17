import java.text.DecimalFormat;

public class BankAccountTest {

	BankAccount[] accounts;

	public BankAccountTest() {
	
		accounts = new BankAccount[5];

		accounts[0] = new ChequingAccount();
		accounts[1] = new ChequingAccount();
		accounts[2] = new ChequingAccount();
		accounts[3] = new SavingsAccount();
		accounts[4] = new SavingsAccount();

	}

	public void monthlyProcess(BankAccount[] accounts) {
		for (BankAccount account : accounts) {
			account.calculateAndUpdateBalance();
		}
	}

	public void display(BankAccount[] accounts) {
		DecimalFormat df = new DecimalFormat("$###.##");
		for (int i = 0; i < accounts.length; i++) {

			String accountNum = accounts[i].getClass().getSimpleName();
			accountNum = accountNum.substring(0, accountNum.indexOf('A')) + " Account " + (i + 1) + " Balance: ";
			System.out.println(accountNum + df.format(accounts[i].getBalance()));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BankAccountTest bank = new BankAccountTest();

		System.out.println("Beginning Account Balances: ");
		bank.display(bank.accounts);

		for (int i = 1; i < 13; i++) {
			System.out.println("Month " + i + " Account Balances: ");
			bank.monthlyProcess(bank.accounts);
			bank.display(bank.accounts);
		}
	}
}
