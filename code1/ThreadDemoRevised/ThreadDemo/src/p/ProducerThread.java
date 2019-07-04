package p;
public class ProducerThread extends Thread {
	Main threadMain;
	int numberOfElements;

	public ProducerThread(Main threadMain, int numberOfElements) {
		super();
		this.threadMain = threadMain;
		this.numberOfElements = numberOfElements;
	}

	public void run() {
			
				for (int i = 0; i < numberOfElements; i++) {			
				synchronized(threadMain) {
								
				try {
					threadMain.value = i;
					threadMain.wait();
				} catch (Exception e) {
					System.out.println("PRO ER "+e.getMessage());
				}
				//notify();

			}
		}
	}
}
