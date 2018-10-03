package co.edureka.lang;

// import java.lang.String; -> Not Required to put an import

//class Student extends Object{ // by default every class in java is child or grandchild of Object
class Student{
	
	int roll;
	String name;
	
	// toString of Object is Overrided in Student 
	public String toString() {
		String str = roll+" belongs to "+name;
		return str;
	}
}

class Car{
	
}

public class LangPackageDemo {

	public static void main(String[] args) {
		
		System.out.println("Square Root of 169 is: "+Math.sqrt(169));
		System.out.println("Log of 100 is: "+Math.log(100));
		System.out.println("PI is: "+Math.PI);

		String str = new String("Hello");
		StringBuilder builder = new StringBuilder("Hello");
		
		// Thread Safety : When multiple thread will access StringBuffer, lock shall be acquired automatically !!
		StringBuffer buffer = new StringBuffer("Hello");
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		
		Student s2 = new Student();
		s2.roll = 201;
		s2.name = "Jack";
		
		s1 = s2; // Reference Copy | what is in s2, is now in s1
		
		//s1 = new Car(); // error | Type is not matching
		//s1 = new Object(); // child cannot point to Parent
		
		System.out.println("s1 class is: "+s1.getClass());
		System.out.println("s1 hashCode is: "+s1.hashCode());
		System.out.println("s2 hashCode is: "+s2.hashCode());
		System.out.println("s1 hashCode hex is: "+s1.toString());
		System.out.println("s1 hashCode hex is: "+s1);

	}

}
