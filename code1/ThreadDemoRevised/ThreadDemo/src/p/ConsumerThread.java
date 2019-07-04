package p;
public class ConsumerThread  extends Thread{
	Main threadMain;
	int numberOfElements;

	public ConsumerThread(Main threadMain, int numberOfElements) {
		super();
		this.threadMain = threadMain;
		this.numberOfElements = numberOfElements;
	}

	public void run() {
		int i;		
			for (i = 0; i < numberOfElements; i++) {				
					try { 
						Thread.sleep(1000);
					synchronized (threadMain) {
						System.out.println("Consumed Thread " + threadMain.value);
						//wait();
						threadMain.notify();
					} 					
					}catch(Exception e) {
							System.out.println("CON ER "+e.getMessage());
					}
		 }
	}

}
