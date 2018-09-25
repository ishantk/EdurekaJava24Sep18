
public class BreakAndContinue {

	public static void main(String[] args) {
		
		int myApartmentFloor = 35;
		
		for(int floor=1; floor<=100; floor++){
			System.out.println("We are on Floor #"+floor);
			
			if(floor == myApartmentFloor){
				System.out.println("Stop the Lift");
				break; // terminate the loop now
			}
			
		}
		

		System.out.println("**********");
		
		for(int i=1;i<=10;i++){
			
			if(i<5){
				continue; // skip the below instructions in the loop and takes the loop to next iteration
			}
			
			System.out.println("We are on Floor #"+i);
		}
		
		
		

	}

}
