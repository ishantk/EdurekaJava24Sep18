interface Inf1{
	
	int i = 10; // public static final int i = 10;
	
	void show();
	void fun();
}

interface Inf2{
	
	int i = 100;
	
	void hello();
	void fun();
	
}

			   // Multiple Inheritance but from Interface to Interface
interface Inf3 extends Inf1, Inf2{
	
}

// Inheritance Techniques:
// 1. Object to Object
// 2. Class to Class
// 3. Interface to Interface

// Implementation Technique
// 1. Object implementing Interface

		// Multiple Implementation, but not Multiple Inheritance
//class CA implements Inf1, Inf2 {

class CA implements Inf3 {
	
	public void show(){
		System.out.println("This is show !!");
	}
	
	public void fun(){
		System.out.println("This is fun !!");
	}
	
	public void hello(){
		System.out.println("This is hello !!");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		/*
		Inf1 iRef1 = new CA();
		iRef1.show();
		iRef1.fun();
		//iRef1.hello(); // error
		
		System.out.println();
		
		Inf2 iRef2 = new CA();
		iRef2.hello();
		iRef2.fun();
		//iRef2.show(); // error
		
		
		// We cannot modify i as its final
		//Inf1.i = 100; // error
		//CA.i = 1000;  // error
		
		System.out.println("i is: "+Inf1.i);
		System.out.println("i again is: "+CA.i); // static context*/
		
		// Polymorphic Statement: Ref Var or Interface can point to the Object which implements it
		Inf3 iRef3 = new CA();
		iRef3.show();
		iRef3.fun();
		iRef3.hello();
		
		//System.out.println("i is: "+Inf3.i);
		//System.out.println("i 1 is: "+Inf1.i);
		//System.out.println("i 2 is: "+Inf2.i);

	}

}
