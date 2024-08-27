package singlethreading;

public class ThreadCaller {   //runs the run() as a sequence or one by one.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread childThread = new ChildThread();
		childThread.run();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Main Thread"+ i);
		}

	}

}
