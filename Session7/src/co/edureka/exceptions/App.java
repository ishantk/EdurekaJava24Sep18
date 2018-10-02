package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");

		int a = 10, b = 0, c = 0;
		
		int [] arr = {10, 20, 30, 40, 50};
		
		try{
			System.out.println("arr[2] is: "+arr[2]);   // 1
			c = a/b;									// 2
		}/*catch(ArrayIndexOutOfBoundsException aRef){ // aRef is a ref var which will capture the ref of thrown object by JVM
			System.out.println("## OOPS!! Some Error: "+aRef);
			//System.out.println("## Error with Message: "+aRef.getMessage());
			//aRef.printStackTrace(); // will show line numbers as well
		}catch(ArithmeticException aRef){ // aRef is a ref var which will capture the ref of thrown object by JVM
			System.out.println("## OOPS!! Some Error: "+aRef);
		}*/
		catch(Exception e){ // e is a ref var which will capture the ref of thrown object by JVM
			System.out.println("## OOPS!! Some Error: "+e);
		}
		finally{
			System.out.println("This must be executed"); // executed, either exception comes or not
		}
		
		
		System.out.println("c is: "+c);
		
		
		System.out.println(">> App Finished");
		
		// Graceful/Normal Termination of App. (First to the last statement was executed)
		
		// DisGraceful/AbNormal Termination of App. (First to the last statement was not executed)
		// In between somewhere program stopped working. Program Crashed !! > Error at Run time > Exception
		
		// For any abnormality, JVM creates an Object, writes the message in object and throws it !!
	}

}
