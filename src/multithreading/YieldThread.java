package multithreading;

public class YieldThread extends Thread {

	public void run() {
	   for(int i=1; i<=5; i++) {
		   Thread.yield();
		   System.out.println("Yield Thread"+ i);
	   }
	}
}
