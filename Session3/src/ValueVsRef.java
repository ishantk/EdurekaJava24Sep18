
public class ValueVsRef {

	public static void main(String[] args) {
		
		// Primitives
		int a = 10;
		int b = a; // Value Copy Operation
		
		// References
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = arr1; // Reference Copy Operation
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		System.out.println("---------");
		
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr2 is: "+arr2);
		
		// Lets update data in containers
		a = 100;
		arr1[1] = 123;
		
		System.out.println("a is: "+a);
		System.out.println("arr1[1] is: "+arr1[1]);
		
		System.out.println("b is: "+b);
		System.out.println("arr2[1] is: "+arr2[1]);

	}

}
