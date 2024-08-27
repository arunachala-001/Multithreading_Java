package multithreading;

import singlethreading.ChildThread;

public class MultiThreadCaller {

	public static void main(String[] args) throws InterruptedException {
		ChildMultiThread cmt = new ChildMultiThread();
		//cmt.start();  //starts the new thread and execute run method and main parallely 
		System.out.println(cmt.getState());  // you can the state from using getState()
		cmt.setPriority(1);
		cmt.start();
		
		System.out.println(cmt.getState());
		
		
		ChildThread ct = new ChildThread();
		ct.start();
//		ct.start(); IllegalThreadStateException
		
		
		YieldThread yt = new YieldThread();
		yt.start();
	
		
		SleepThread st = new SleepThread();
		st.start();
		st.interrupt();
		st.join(); //The Main thread is waiting for ct to complete the execution.
		
		for(int i=1; i<=5; i++) {
			System.out.println("Main Thread"+ i);
		}
		System.out.println(cmt.getState());

	}

}


// case 1 cmt.start() -> you are creating the new thread
// case 2 childThread.run() -> is a single thread
// case 3 run() method is overridden in childMultiThread class
