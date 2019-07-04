package q;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void run() {
		try {
			Long duration = (long) (Math.random() * 10);
			System.out.println(Thread.currentThread().getName()+" doing a task during : " + name);
			//Thread.sleep(1000);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {	}
	}

}
