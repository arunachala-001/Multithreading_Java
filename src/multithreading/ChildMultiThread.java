package multithreading;

public class ChildMultiThread extends Thread {

	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Child Multi Thread"+ i);
		}
	}
}
