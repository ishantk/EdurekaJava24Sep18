
public class NestedLoops {

	public static void main(String[] args) {
		
		// loop will run 5 times for i value ranging from 1 to 5
		for(int i=1;i<=5;i++){
			System.out.println("For i: "+i);
			
			// loop will run 3 times for j value ranging from 1 to 3
			for(int j=1;j<=3;j++){
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}
		
		System.out.println("==Output Below==");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
