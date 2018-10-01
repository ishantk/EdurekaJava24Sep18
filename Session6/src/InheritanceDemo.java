class Product{
	
	// Attributes : Property of Object
	int pid;
	int price;
	String name;
	String brandName;
	
	// static Attributes : Property of Class
	static String appName;
	
	// Constructor
	Product(){
		System.out.println(">> Product Object Construted");
	}
	
	// Methods
	// Write in Object Method !!
	void setProductDetails(int pid, int price, String name, String brandName){
		this.pid = pid;
		this.price = price;
		this.name = name;
		this.brandName = brandName;
		//(LHS) this.pid belongs to object where as (RHS)pid belongs to method
		
		System.out.println(">> Data Written in Product Object");
	}
	
	// Read From Object
	void showProductDetails(){
		System.out.println("-----Product Id: "+pid+"------");
		System.out.println("Price:\t"+"\u20b9"+price);
		System.out.println("Name:\t"+name);
		System.out.println("Brand:\t"+brandName);
		System.out.println("--------------------------");
	}
	
	static void showAppName(){
		System.out.println("===App Name: "+appName+"===");
	}
}
	//Child 			  Parent
class MobilePhone extends Product{ // IS-A Relation
	
	// Attributes: Additional Attributes to the MobilePhone Object
	String os;
	int ram;
	int sdCardSize;
	
	MobilePhone(){
		System.out.println(">> Mobile Phone Object Constructed");
	}
	
	// Lets Re-Define the method setProductDetails in the Child with different inputs
	// OVERLOADING
	// Why we created whis method? So as to customize the Parent's Definition to accommodate my own data as well !!
	void setProductDetails(int pid, int price, String name, String brandName, String os, int ram, int sdCardSize){
		this.pid = pid;
		this.price = price;
		this.name = name;
		this.brandName = brandName;
		//(LHS) this.pid belongs to object where as (RHS)pid belongs to method
		
		this.os = os;
		this.ram = ram;
		this.sdCardSize = sdCardSize;
		
		System.out.println(">> Data Written in MobilePhone Object");
	}
	
	
	// Lets Re-Define showProductDetails so as to customize read operation in child
	// We need not to change Signature i.e. no inputs are required to be modified here
	// OVERRIDING
	void showProductDetails(){
		System.out.println("-----Product Id: "+pid+"------");
		System.out.println("Price:\t"+"\u20b9"+price);
		System.out.println("Name:\t"+name);
		System.out.println("Brand:\t"+brandName);
		System.out.println("OS:\t"+os);
		System.out.println("RAM:\t"+ram);
		System.out.println("Size:\t"+sdCardSize);
		System.out.println("--------------------------");
	}
	
	// Lets Re-Define showAppName so as to customize read operation in child class
	// We need not to change Signature i.e. no inputs are required to be modified here
	// HIDING
	static void showAppName(){
		System.out.println("***App Name: "+appName+"***");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
	
		/* BEFORE CASE
		//1. Create an Object
		Product pRef = new Product();
		//2. Write Data in Object
		pRef.setProductDetails(101, 70000, "iPhoneX", "Apple");
		//3. Read Data from Object
		pRef.showProductDetails();
		*/
		
		//1. Create an Object
		//   We are requesting for MobilePhone Object
		//   Rule of Inheritance, Parent object is constructed than Child object is constructed
		//   Other than private and Constructors everything is inherited
		MobilePhone mRef = new MobilePhone();
		
		//2. Write Data in Object
		//mRef.setProductDetails(101, 70000, "iPhoneX", "Apple");
		mRef.setProductDetails(101, 70000, "iPhoneX", "Apple", "iOS", 4, 128);
		
		//3. Read Data from Object
		mRef.showProductDetails(); // will execute the Child's version hence, overriding the Parent's version 
		
		// Conclusions
		// 1. MobilePhone Object is more meaningful than just writing the Product Object before
		// 2. IS-A Relationship can help us wiht many more powerful features
		
		MobilePhone.appName = "Amazon";
		MobilePhone.showAppName();
		
	}

}
