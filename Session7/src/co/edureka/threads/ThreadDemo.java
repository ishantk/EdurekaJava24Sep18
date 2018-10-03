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
			
			try {
				// sleep is to temporarily pause the execution for 1 second. 
				// Its a kind of delay !!
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("## Task "+i);
		}
	}
}

class CA{
	
}

//class AnotherTask extends CA, Thread{ // error , Multiple Inheritance is not Supported in Java
class AnotherTask extends CA implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				// sleep is to temporarily pause the execution for 1 second. 
				// Its a kind of delay !!
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("** AnotherTask "+i);
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
		System.out.println("TaskState1: "+tRef.getState());
		
		Runnable r = new AnotherTask(); // Polymorphic Statement
		Thread aRef = new Thread(r);    // Thread Object with runnable ref as input
		
		tRef.setName("John");
		aRef.setName("Jennie");
		Thread.currentThread().setName("Mike");
		
		// Priority is a Request, which is to tell in low memory conditions or when JVM is highly occupied, please consider this priority
		tRef.setPriority(Thread.MIN_PRIORITY); 					  // 1
		aRef.setPriority(Thread.MAX_PRIORITY);					  // 10
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		//tRef.executeTask();
		tRef.start(); // start method will internally execute the run method
		System.out.println("TaskState2: "+tRef.getState());
		// Immediately after the start method, lets execute join		
		try {
			// Command saying execute my jobs first and let others wait !!
			tRef.join(); // Kind of Synchronization, where all other threads are waiting 
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("TaskState3: "+tRef.getState());
		
		// Some conditions coming in !!
		if(tRef.getState().equals(Thread.State.TERMINATED)){
			//....
		}
		
		aRef.start();
		
		for(int i=1;i<=10;i++){
			try {
				// sleep is to temporarily pause the execution for 1 second. 
				// Its a kind of delay !!
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> main thread "+i);
		}
		
		System.out.println("Task id is: "+tRef.getId()+", Name is: "+tRef.getName()+" and Priority is: "+tRef.getPriority());
		System.out.println("AnotherTask id is: "+aRef.getId()+", Name is: "+aRef.getName()+" and Priority is: "+aRef.getPriority());
		System.out.println("main id is: "+Thread.currentThread().getId()+", Name is: "+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
		
		System.out.println(">> main thread finished");

	}
	
	// We will see outputs from both the threads !!
	// Asynchronus Execution i.e. Concurrent  or Parallel Execution
	// Threads are now running parallely 

}
