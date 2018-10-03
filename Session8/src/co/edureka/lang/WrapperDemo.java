package co.edureka.lang;

class Employee{
	
	public String toString(){
		String str = "A great Employee !!";
		return str;
	}
	
}

public class WrapperDemo {

	public static void main(String[] args) {
		
		// Primitive Type
		int i = 10;
		
		// Convert it to a Ref Type
		Integer iRef = new Integer(i);		// BOXING
		
		char ch = 'A';
		Character cRef = new Character(ch);	// BOXING
		
		long l = 1000000000L;
		Long lRef = new Long(l); 			// BOXING
		
		double d = 2.2;
		Double dRef = new Double(d); 		// BOXING
		
		// Extract Primitive out of Object
		int j = iRef.intValue();			// UNBOXING
		char chr = cRef.charValue();		// UNBOXING
		long n = lRef.longValue();			// UNBOXING
		double e = dRef.doubleValue();		// UNBOXING
		
		int x = 10;
		Integer xRef = x;					// AUTO-BOXING			Integer xRef = new Integer(x);
		int y = xRef;						// AUTO-UNBOXING		int y = xRef.intValue();
		
		String str = "10";
		int num = Integer.parseInt(str); 	// Converting String to Integer
		System.out.println("num is: "+num);
		
		System.out.println("cRef is: "+cRef);
		
		System.out.println("xRef is: "+xRef); // Typically we will get hashCode when we print Reference Variable
		// But here we get the Value
		
		// Printing of Ref Var will automatically execute toString method
		System.out.println("xRef.toString() is: "+xRef.toString());

		// Why it is not showing the hashCode and showing the value ??
		// toString method of Object class is overrided in Integer Wrapper class which returns value rather than hashCode
		
		Employee eRef = new Employee();
		System.out.println("eRef is: "+eRef);
		System.out.println("eRef.toString() is: "+eRef.toString());
		
		// For any ref type if you do not see hashCode rather you see some values
		// it menas toString method is overrided !!
	}

}
