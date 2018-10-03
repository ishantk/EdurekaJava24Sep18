package co.edureka.threads;

// Object is the parent class of all the classes in Java
// toString, getClass, hashCode, wait, notify....

class Message{// extends Object{
	
	String message = "No Message Available";
	
	void readMessage(){
		System.out.println(">> Message is: "+message);
	}
	
	void writeMessage(String m){
		message = m;
		System.out.println(">> Message Written");
	}
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(Message m){
		mRef = m;
	}
	
	public void run(){
		synchronized (mRef) {
			
			try {
				// wait says to wait to perform any operation further on object pointed by mRef, till someone notify 
				mRef.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// Below statements will not be executed as we are waiting on mRef
			mRef.readMessage();
		}
	}
}

class WriterThread extends Thread{
	
	Message mRef;
	
	WriterThread(Message m){
		mRef = m;
	}
	
	public void run(){
		synchronized (mRef) {
			mRef.writeMessage("Be Exceptional !!");
			
			// After writing the message, notify to the thread which is waiting on mRef to perform further execution
			//mRef.notify();
			mRef.notifyAll();
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message mRef = new Message();
		/*mRef.readMessage();
		mRef.writeMessage("Be Exceptional !!");
		mRef.readMessage();*/

		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		
		WriterThread wt = new WriterThread(mRef);
		
		// High chances that only ReaderThread will start firstly
		rt1.start();
		rt2.start();
		
		wt.start();
		
		// RTP on Object Level
		// Object o = new ReaderThread(mRef);
		// o = new WriterThread(mRef);
		
	}

}
