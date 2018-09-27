
public class Strings {

	public static void main(String[] args) {
		
		// Primitive Type -> We store Value
		char ch = 'A';
		
		// String is A Reference Type -> We are having hashCode
		
		// Interned Way : str1 and str2 are pointing to a String Literal (constant value -> Hello World)
		String str1 = "Hello World";
		String str2 = "Hello World";
		
		// Object Way : str3 and str4 are pointing to a String Object (constant value within Object -> Hello World)
		String str3 = new String("Hello World");
		String str4 = new String("HELLO World");
		
		// Printing Reference Variables, magic happens here
		// we cannot see the hex hashCode but we are able to see the value directly !!
		System.out.println("===String without toString===");
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		System.out.println("===String with toString===");
		// Why Value is shown and not hex hashCode ?
		// Because toString method is executed on reference types
		System.out.println("str1 is: "+str1.toString());
		System.out.println("str2 is: "+str2.toString());
		System.out.println("str3 is: "+str3.toString());
		System.out.println("str4 is: "+str4.toString());

		// toString method is executed automatically on reference variables for the Strings and hence we can see value instead of hashCode
		
		// Proof that Strings are reference type
		// As Comparing Strings is basically Reference Comparison !!
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		// If we wish to compare Strings as in contents and not references !!
		//if(str3.equals(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 is equal to str4");
		}else{
			System.out.println("str3 not equal to str4");
		}
		
		//if(str3.compareTo(str4) == 0){
		if(str3.compareToIgnoreCase(str4) == 0){
			System.out.println("str3 is comapred to str4");
		}else{
			System.out.println("str3 not compared to str4");
		}
		
	}

}
