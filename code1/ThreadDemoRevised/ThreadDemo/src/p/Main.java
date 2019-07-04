package p;

import java.util.Scanner;
//http://www.journaldev.com/1037/java-thread-wait-notify-and-notifyall-example
public class Main {
	int value;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		 int n = sc.nextInt();

		Main m = new Main();

		 ProducerThread p = new ProducerThread(m, n);
		 ConsumerThread c = new ConsumerThread(m, n);

		
		p.start();
		c.start();
		
	}
}
