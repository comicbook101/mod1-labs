package lab5;

public class Account {
	int id;
	String owner;
	double balance;
	
	public Account (int id, String owner, double balance){
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	void Deposit(double amount) {
		if (amount < 0 ) {
			System.out.println("You can not deposit an amount less then £0");
		} else {
			this.balance += amount;
		}
	}
	
	void Withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("You do not have enough money to withdraw this amount");
		} else {
			this.balance -= amount;
		}
	}
	
	String getDetials() {
		String detials = "id: " + this.id + "\nOwner: " + this.owner + "\nBlanace " + this.balance;
		System.out.println(detials);
		return detials;
	}
	
	public void AddInterest() {
		this.balance += this.balance * 2.5;
		System.out.println(this.balance);
	}
}
