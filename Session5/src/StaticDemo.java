class Counter{
	
	// Non Static Attributes : Property of Object
	int count;
	
	// Static Attributes : Property of Class
	static int sCount;
	
	// Constructor : Property of Object
	Counter(){
		count = 1;
		sCount = 1; // Property of class can be accessed by Property of Object
	}
	
	void incrementCount(){
		count++; // increment the count by 1
		sCount++; // Property of class can be accessed by Property of Object
	} 
	
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("sCount is: "+sCount); // Property of class can be accessed by Property of Object
	}
	
	// static method -> Property of class
	static void showSCount(){
		//System.out.println("count is: "+count); // error : Property of object cannot be accessed by Property of Class
		System.out.println("sCount is: "+sCount);
	}
}

// Property of class can be accessed by Property of Object
// Property of object cannot be accessed by Property of Class

public class StaticDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter(); // sCount = 1
		Counter c2 = new Counter(); // sCount = 1
		Counter c3 = c1; // Reference Copy !!
		
		c1.incrementCount(); // sCount 2
		
		Counter.sCount = 10; // sCount = 10
		c1.sCount = 100;
		
		c1.showCount(); // 2 2
		System.out.println();
		c2.showCount(); // 1 2
		System.out.println();
		c3.showCount(); // 2 2
		System.out.println();
		
		Counter.showSCount();

	}

}
