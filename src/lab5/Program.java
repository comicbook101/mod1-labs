package lab5;

public class Program {

	public static void main(String[] args) {
		//int k = 100;

		// Account[] newAccounts = {new Account(222, "Dan", 2000), new Account(333,
		// "Will", 3000), new Account(444, "Mark", 4000)};
		Account myAccount = new Account(123, "George", 100);
		//Account partnerAccount = myAccount;

		myAccount.getDetials();
		myAccount.AddInterest();
		myAccount.getDetials();
	}

	static void processAccount(Account acc) {
		acc.AddInterest();
	}

//	private static void incInt(int x) {
//		x++;
//	}

//		account.Withdraw(2000);
//		account.Deposit(0);
//		
//		account.getDetials();

//		for (Account accounts : newAccounts) {
//			accounts.getDetials();
//		}
}
