// class is just a textual representation of how an object will look like in the memory !!
class User{
	
	// Attributes : Property of Object and not the Property of Class
	// Attributes below belong to Object
	// Instance Variables or State or Data Members. Object is also known as Instance
	
	// Attributes can be private or non private !!
	String name;
	private String phone; // so that we can have a method with some rules, so that we can have the data in a format we are looking for
	String email;
	private int age;
	char gender;
	String address;
	
	// Methods : are the ways to process data
	// We can do operations on data: they can be a read write operation or some logical operation
	
	// Methods are the property of Object !! Not of Class !! :)
	
	// Setters and Getters
	void setPhone(String ph){ // write operation on attributes
		// setters can have rules
		if(ph.length() >=10){
			phone = ph;
		}else{
			phone = "NA";
		}
	}
	
	String getPhone(){		 // read operation on attribute
		return phone;
	}
	
	void setAge(int age){   // input is same name as that of object's attribute
		this.age = age;     // this.age belongs to object's age, and age belongs to method setAge
		// this is a ref var which will point to current object in use
	}
	
	int getAge(){
		return age;
	}
	
	// Generic Write All and Read All
	void registerUser(String nm, String ph, String em, int ag, char gn, String ad){
		name = nm;
		phone = ph;
		email = em;
		age = ag;
		gender = gn;
		address = ad;
	}
	
	void showUserDetails(){
		System.out.println("======="+name+" Details========");
		System.out.println("Phone \t"+phone+"\nEmail \t"+email+"\nAge \t"+age+"\nGender \t"+gender+"\nAddress\t"+address);
		System.out.println("===============================");
	}
}


public class ObjectDemo { // Class containing main method

	public static void main(String[] args) {
		
		int a = 10;
		
		// Lets Create User Object
		User user1 = new User();
		User user2 = new User();
		
		User user3 = user1; // Reference Copy 
		
		// new will create an object in the heap area.
		// user1 will hold the hashCode for the Object
		
		System.out.println("a is: "+a);
		
		// PS: user1 and user2 are not object's. They are reference variables pointing to Objects
		System.out.println("user1 is: "+user1);
		System.out.println("user2 is: "+user2);
		System.out.println("user3 is: "+user3);
		
		// To access Object
		
		// 1. Write data in Object !! -> Directly
		user1.name = "John";
		//user1.phone = "+91 99999 88888";
		user1.setPhone("+91 99999 88888");
		user1.email = "john@example.com";
		//user1.age = 30;
		user1.setAge(30);
		user1.gender = 'M';
		user1.address = "Redwood Shores";

		user2.name = "Jennie";
		//user2.phone = "+91 99999 77777";
		user2.setPhone("+91 99999 77777");
		user2.email = "jennie@example.com";
		//user2.age = 32;
		user2.setAge(32);
		user2.gender = 'F';
		user2.address = "Country Homes";
		
		// 2. Read data from Object !! -> Directly
		
		System.out.println("**************");
		//System.out.println(user1.name+" is "+user1.age+" years old and can be contacted at "+user1.phone);
		System.out.println(user1.name+" is "+user1.getAge()+" years old and can be contacted at "+user1.getPhone());
		System.out.println("**************");
		//System.out.println(user2.name+" is "+user2.age+" years old and can be contacted at "+user2.phone);
		System.out.println(user2.name+" is "+user2.getAge()+" years old and can be contacted at "+user2.getPhone());
		System.out.println("**************");
		
		// 3. Updating data in Object !!
		// Attributes of an object are variables, thr content can be modified anytime !!
		user1.name = "John Watson";
		//user1.age = 47;
		user1.setAge(47);
		user1.email = "john.watson@example.com";
		
		// Re-Reading user1 details
		//System.out.println(user3.name+" is "+user3.age+" years old and can be emailed at "+user3.email);
		System.out.println(user3.name+" is "+user3.getAge()+" years old and can be emailed at "+user3.email);
		
		
		User user4 = new User();
		// Write Operation with a Method -> Indirectly
		user4.registerUser("Mike", "+91 99999 77777", "mike@example.com", 50, 'M', "Pristine Magnum");
		
		// Read Operation with a Method -> Indirectly
		user4.showUserDetails();
		
		
		// 4. Delete !! Happens automatically by Garbage Collector
		System.gc(); // Explicitly calling Garbage Collector to remove unused objects from Heap
	}

}
