package co.edureka.threads;

/*class Task{
	void executeTask(){
		for(int i=1;i<=1000;i++){
			System.out.println("## Task "+i);
		}
	}
}*/

class Task extends Thread{
	// run is the method of Thread Class which we override here
	// we define jobs of Task in run method
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("## Task "+i);
		}
	}
}

public class ThreadDemo {

	// main method will contain jobs for the main thread, which will be executed in a sequence !!
	public static void main(String[] args) {
		System.out.println(">> main thread started");
		
		int num = 10+20+30;
		System.out.println(">> num is "+num);
		
		Task tRef = new Task();
		//tRef.executeTask();
		tRef.start(); // start method will internally execute the run method
		
		for(int i=1;i<=10;i++){
			System.out.println(">> main thread "+i);
		}
		
		System.out.println(">> main thread finished");

	}
	
	// We will see outputs from both the threads !!
	// Asynchronus Execution i.e. Concurrent  or Parallel Execution
	// Threads are now running parallely 

}
