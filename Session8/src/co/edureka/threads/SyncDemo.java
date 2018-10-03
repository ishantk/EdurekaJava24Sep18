package co.edureka.threads;

// Object of Table is shared mutually !!
class Table{
	// Who so ever access printTable firstly shall acquire a lock and hence, no other thread can access it
	// Once, execution of prinTable will be finished, lock will be automatically released
	//synchronized void printTable(int num){
	
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i)); 
		}
	}
	
	void sayHello(){
		System.out.println("Hello, Its a good day !!");
	}
}

class MyThread extends Thread{
	
	Table tRef;
	
	MyThread(Table t){
		tRef = t;
	}
	
	public void run(){
		
		synchronized (tRef) {
			
			System.out.println("** MyThread Printing the Table");
			tRef.printTable(5);
			System.out.println("** MyThread Job Finished");
			tRef.sayHello();
		}
	
	}
}

class YourThread extends Thread{
	
	Table tRef;
	
	YourThread(Table t){
		tRef = t;
	}
	
	public void run(){
		synchronized (tRef) {
			System.out.println("** YourThread Printing the Table");
			tRef.printTable(7);
			System.out.println("** YourThread Job Finished");
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		
		System.out.println(">> Main Thread Started");
		
		Table tRef = new Table();
		//tRef.printTable(5);
		
		// Use Case : 2 different threads are working on the same object !!
		MyThread mRef = new MyThread(tRef);
		YourThread yRef = new YourThread(tRef);
		
		// Threads will run Asynchronously !! Parallel or Concurrent Execution !!
		// Why we want threads, this is the only reason i.e. concurrent execution !!
		
		// For a Use Case where 2 different threads are working on the same object we should be implementing Synchronization
		
		mRef.start();
		
		// As a solution we can put join immediately after start method to make MyThread run and all others wait
		/*try {
			mRef.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		yRef.start();
		
		
		System.out.println(">> Main Thread Finished");

	}

}
