
public class StringAPIs {

	public static void main(String[] args) {
		
		String saluation = "Mr.";
		String fname = "John";
		String lname = "Watson";
		
		// String conactenation
		//String completeName = saluation + " "+ fname + " "+lname;
		
		String completeName = saluation.concat(fname).concat(" ").concat(lname);
		
		System.out.println("Complete Name is: "+completeName);
		
		System.out.println("------------------------");

		// Strings are IMMUTABLE !! i.e. they cannot change !!
		// Any Operation on String will generate a new String !!
		String names = "John, Jennie, Jim, Jack, Joe";
		String upperCaseNames = names.toUpperCase();
		System.out.println("name is: "+names);
		System.out.println("upperCaseNames is: "+upperCaseNames);
		
		// 10 is immutable, A is immutable
		String[] arr = names.split(",");
		
		for(String s : arr){
			System.out.println(s.trim()); // removes white spaces from front and back only not in between
		}
		
		if(names.contains("John")){
			System.out.println("John is IN");
		}

		String str1 = "Hello"; // 4001
		//String str2 = "Bye";   // 5001
		str1 = "Bye"; // Hello in ConstantPool is still thr, we just changed the address in the ref var to hold Bye 
		
		int length = names.length();
		System.out.println("length of names is: "+length);
		
		char ch = names.charAt(0);
		System.out.println("ch is: "+ch);
		
		int idx = names.indexOf('J');
		System.out.println("idx is: "+idx);
		idx = names.lastIndexOf('J');
		System.out.println("Last idx is: "+idx);
		
		idx = names.indexOf("Jennie");
		System.out.println("Jennie idx is: "+idx);
		
		//String names = "John, Jennie, Jim, Jack, Joe";
		
		//String name = names.substring(6,11); // 6 inclusive and 11 not inclusive
		//System.out.println("name is: "+name);
		String name = names.substring(10); // string after 10 (10 is inclusive)
		System.out.println(name);
		
		String newNames = names.replace('J', 'K');
		System.out.println(newNames);
		
		//...
	}

}
