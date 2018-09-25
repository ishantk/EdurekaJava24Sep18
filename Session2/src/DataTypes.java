
public class DataTypes {

	public static void main(String[] args) {
		
		// Model -> Single Value Container
		// Primitive Data Types: Which shall store a single value
		
		// Integral
		
		// age is the name of storage container, 20 is the data (Literal), byte is the storage container type which also defines the size

		// 1. Writing the Data 
		byte age = 20; // 8 Bits
		
		// 2. Read the data
		System.out.println("age is: "+age);
		
		// 3. Update the data
		age = 22;
		System.out.println("age after update is: "+age);
		// Hence, age is a variable
		
		// 4. Deletion of data
		// Happens automatically for us !!
		
		// byte num = 10,20; // error -> num is a Single Value Container and cannot hold multiple values !!
		
		short s = 100;			 // 16 bits
		int i = 1000; 			 // 32 bits
		long l = 1000000000000L; // 64 bits
		
		// A storage container having a size of 8 bits -> 2 pow 8 -> 256
		// Divide 256/2 -> 128 so possible data which can be stored is -128 to 0 to 127
		
		age = 127; // max value
		
		// Floating Points
		float pi1 = 3.14f; 	// 32 bits
		double pi2 = 3.14;  // 64 bits
		
		// float double int short etc are keywords : Reserved Words which will have a specific meaning
		// pi1 or s or age -> they are also known as identifier(name of storage container)
		// value which container holds is data and is also known as literal
		
		// Characters
		char ch = 'A'; 
		//char someCh = 'AB'; // error -> A and B are multiple characters
		System.out.println("ch is: "+ch);
		
		// UniCode for Indian Rupee
		ch = '\u20b9';
		ch = '\u0905';
		System.out.println("ch now is: "+ch);
		
		// ASCII Code
		ch = 67;
		System.out.println("ch is: "+ch);
		
		// Boolean
		boolean gpsConnected = true;
		//gpsConnected = false;
		
		System.out.println("Is GPS Connected? "+gpsConnected);
	}

}
