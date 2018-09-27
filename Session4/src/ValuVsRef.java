
public class ValuVsRef {
	
	void printNum(int num){ // num will receive a value i.e. Value Copy Happens
		num = num + 1; // manipulating the num
		System.out.println("num is: "+num);
	}
	
	void printArray(int[] arr){ // arr will receive a reference value i.e. Reference Copy Happens
		
		System.out.println("arr is: "+arr);
		
		arr[0] = 11;
		arr[4] = 55;
		
		for(int elm : arr){
			System.out.print(elm+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = a; 		   // Value Copy
		
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = arr1; // Reference Copy
		
		ValuVsRef vr = new ValuVsRef();
		
		vr.printNum(a);      // Value is passed here
		System.out.println("a after printNum exeuction is: "+a);
		// a is separate container (created in method main) and num is a separate container (created in method printNum)
		
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr2 is: "+arr2);
		vr.printArray(arr1); // Passing the Reference
		System.out.println("arr1 after printArray exeuction is:");
		for(int elm : arr1){
			System.out.print(elm+"  ");
		}
		System.out.println();
	} 

}
