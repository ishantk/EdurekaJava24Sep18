
public class Conditions {

	public static void main(String[] args) {

		// Regular if/else
		
		int priceEstimation = 150; // Home to Office
		
		if(priceEstimation > 250){
			System.out.println("Book UberGo for Me !!");
		}else{
			System.out.println("Book UberX for Me !!");
		}
		
		// Nested if/else
		
		boolean internetConnected = false;
		boolean gpsEnabled = true;
		
		if(internetConnected){
			if(gpsEnabled){
				System.out.println("You can Use Uber App and Book the Cab");
			}else{
				System.out.println("Uber needs GPS Connectivity to work !!");
			}
		}else{
			System.out.println("Please check you Internet and Try Again !!");
		}
		
		// Ladder if/else
		
		int uberGo = 1;
		int uberX = 2;
		int uberMoto = 3;
		
		int userChoice = 1;
		
		if(userChoice == 1){
			System.out.println("UberGo has been Booked !! Cab Arriving !!");
		}else if(userChoice == uberX){
			System.out.println("UberX has been Booked !! Cab Arriving !!");
		}else if(userChoice == uberMoto){
			System.out.println("UberMoto has been Booked !! Cab Arriving !!");
		}else{
			System.out.println("Please Select a Valid Cab First !!");
		}
		
	}

}
