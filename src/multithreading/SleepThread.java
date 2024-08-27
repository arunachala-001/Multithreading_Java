package multithreading;

public class SleepThread extends Thread{

	public void run() {
		   for(int i=1; i<=5; i++) {
			   try {
				Thread.sleep(3000);
				System.out.println("Sleep Thread "+ i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Interupted");
			}
			   
		   }
		}
}
