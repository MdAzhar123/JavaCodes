public class Customer {
	int amount = 10000;

	Customer() {
		System.out.println("Opening Balance " + this.amount);
	}

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw..." + amount);

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
		System.out.println("Balance after withdrawal= " + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit..." + amount);
		this.amount += amount;
		System.out.println("deposit completed... ");
		System.out.println("Balance after deposit= " + this.amount);
		notifyAll();
	}
}
