
public class MutableStrings {

	public static void main(String[] args) {
		
		// Immutable
		String str = new String("Hello");
		str.concat(" World");
		
		// Mutable Versions of String
		
		// Thread-Safe or Synchronized
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		
		//Not Thread-Safe or Not Synchronized
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		
		System.out.println("str is: "+str);
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);
		
		// Buffers and Builders cannot be used as interned Strings
		//StringBuffer sb = "Hello";  // error
		//StringBuilder sl = "Hello"; // error

	}

}
