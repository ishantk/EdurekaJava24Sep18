import java.util.Arrays;

public class MultiDimArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50};
		
		// Array of Arrays | 2-D
		int[][] arr2 = {
							{10, 20}, 				//0
						//   0    1  2   3
 							{10, 20, 30, 40},		//1
							{10, 20, 30, 40, 50}, 	//2
							{10, 20, 30}, 			//3
							{10, 20, 30, 40}		//4
				       };
		
		System.out.println("arr1 is: "+arr1+" and length is: "+arr1.length);  
		System.out.println("arr2 is: "+arr2+" and length is: "+arr2.length);  
		
		System.out.println("arr2[1] is: "+arr2[1]+" and length is: "+arr2[1].length); 
		System.out.println("arr2[1][1] : "+arr2[1][1]);
		
		// Read all Elements in Array
		for(int i=0;i<arr2.length;i++){ // run from 0 to 4
			for(int j=0;j<arr2[i].length;j++){ // run form 0 to arr2[i]'s length - 1
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println();
		}
		//HW : explore enhanced for loop on 2D Arrays

		// You can use a Built In API called Arrays from java.util package
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		// Array of Array of Arrays
		int[][][] arr3 = {
							{
								{10, 20}, 				//0
								{10, 20, 30, 40},		//1
								{10, 20, 30, 40, 50}, 	//2			//0
								{10, 20, 30}, 			//3
								{10, 20, 30, 40}		//4
					       },
						   {
								{10, 20}, 				//0
								{10, 20, 30, 40},		//1
								{10, 20, 30, 40, 50}, 	//2 		//1
								{10, 20, 30}, 			//3
								{10, 20, 30, 40}		//4
					       }
						 };
		
		System.out.println("arr3 lenngth is: "+arr3.length);
		System.out.println("arr3[0][2] lenngth is: "+arr3[0][2].length);
		System.out.println("arr3[1][2][1] is: "+arr3[1][2][1]);
		
		// N-D Array is a collection of N-1 D Arrays
		// 5-D Array is a collection of 4-D Arrays
		
		// We dont know what to put in this array as data !! data will be set later
		
		//int[][] arr = new int[3][5]; // 3 1-D arrays with each array having 5 elements !!
		
		int[][] arr = new int[5][]; // we want 5 1-D Arrays but what elements they will contain that isnt known !!
		arr[0] = new int[5];  // 0th array will have 5 elements
		arr[1] = new int[10]; // 1st array will have 10 elements
		arr[2] = new int[2];  // 2nd array will have 2 elements
		arr[3] = new int[8];  // 3rd array will have 8 elements
		arr[4] = new int[15]; // 4th array will have 15 elements
		
		arr[2][1] = 100;
		arr[4][1] = 200;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
