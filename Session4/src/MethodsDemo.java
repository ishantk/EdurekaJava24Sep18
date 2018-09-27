import java.util.Scanner; // API

public class MethodsDemo {

	//1. Non Static Function/Method - No Inputs No Ack i.e. No Arguments/Parameters No Return Type
	void sayHello(){
		System.out.println("This is hello from Edureka !!");
		System.out.println("Happy Learning !!");
	}
	
	//2. Non Static Function/Method - With Inputs No Ack i.e. With Arguments/Parameters No Return Type
	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println(num1+" "+num2+" adds to "+num3);
	}
	
	//3. Non Static Function/Method - With Inputs With Ack i.e. With Arguments/Parameters With Return Type
	int multiplyNumbers(int num1, int num2){ // Signature
		int num3 = num1 * num2;				 // Definition
		return num3;						 // return statement whould be the last statement
	}
	// We can have a method with no input but an ack ...
	
	//1. Static Function/Method - No Inputs No Ack i.e. No Arguments/Parameters No Return Type
	// Put a static keyword in the beginning
	static void sayHelloAgain(){
		System.out.println("This is hello from Edureka !!");
		System.out.println("Happy Learning !!");
	}
	
	//2. Static Function/Method - With Inputs No Ack i.e. With Arguments/Parameters No Return Type
	static void addNumbersAgain(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println(num1+" "+num2+" adds to "+num3);
	}
	
	//3. Static Function/Method - With Inputs With Ack i.e. With Arguments/Parameters With Return Type
	static int multiplyNumbersAgain(int num1, int num2){
		int num3 = num1 * num2;
		return num3;
	}	
	
	// Non Static and Static Methods are Executed in a different Way !!
	
	public static void main(String[] args) {
	
		// 1. Execution of Non Static Methods
		//    We need to create the object to execute non static methods
		
		// Object Construction Statement
		MethodsDemo md = new MethodsDemo(); // md is not an object, its a reference variable pointing to the object
		md.sayHello();
		md.addNumbers(10, 20);
		md.addNumbers(12, 34);
		md.addNumbers(32, 67);
		
		int result = md.multiplyNumbers(12, 12);
		System.out.println("Result is: "+result);
		
		System.out.println("===================");
		
		// 2. Execution of Static Methods
		//    We shall use class name
		
		MethodsDemo.sayHelloAgain();
		MethodsDemo.addNumbersAgain(12, 13);
		result = MethodsDemo.multiplyNumbersAgain(13, 13);
		System.out.println("Result is: "+result);
		
		System.out.println("===================");
		
		// To Read From Console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter Number 2");
		int n2 = scanner.nextInt(); 
		
		MethodsDemo.addNumbersAgain(n1, n2);
		
		scanner.close(); // close the scanner to release memory resources
		
	}

}
