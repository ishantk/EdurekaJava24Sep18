
public class ArrayDemo {

	public static void main(String[] args) {
		
		// 1. Arrays with values defined already, we have data for all the indexes before hand
		
		// Implicit Statements
		int[] arr1 = {10, 20, 30, 40, 50}; // Compiler translates the same to: int[] arr1 = new int[]{10, 20, 30, 40, 50};
		
		int arr2[] = {10, 20, 30, 40, 50};
		
		
		// Explicit Statements
		int[] arr3 = new int[]{10, 20, 30, 40, 50};
		
		int arr4[] = new int[]{10, 20, 30, 40, 50};
		
		// new operator -> creates arrays dynamically, i.e. at run time  (Heap)
		// memory allocation decision is taken when program will run
		
		//2. We dont know what to store in Array, so mention size
		//   All the elements will be by default 0
		int[] arr5 = new int[5];
		int arr6[] = new int[10];
		
		// write the data later for arr5 or arr6
		arr5[0] = 60;
		arr5[3] = 500;
		
		// Read Arrays:
		// 1. For Loop
		System.out.println("===arr1 contents===");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+"  ");
		}
		
		System.out.println();
		
		System.out.println("===arr5 contents===");
		for(int i=0;i<arr5.length;i++){
			System.out.print(arr5[i]+"  ");
		}
		
		System.out.println();
		System.out.println("===Enhanced For Loop===");
		
		// 2. Enhanced For Loop
		// Loop will start from 0th index to (arr1.length-1) index
		// Value at index will be copied into elm
		for(int elm : arr1){
			System.out.print(elm+"  ");
		}
		System.out.println();
		for(int num : arr5){
			System.out.print(num+"  ");
		}
		
		System.out.println();
		
		char[] chArr = {'A','E','I','O','U'};
		System.out.println(chArr[2]);

		// 1. Arrays are Homogeneous i.e. will store data of same type
		// 2. Since they are constructed at Run Time with a Size, so size cannot be changed at Run Time.
		// We have dynamic data structures in Java i.e. Collections FW -> Upcoming Sessions !!
		
	}

}
