
public class Elections {

	// main is executed by JVM when we run our Program
	public static void main(String[] args) {
		
		// 1st Way : Using Primitive Type : int |  Data Storage as in Single Value Container
		
		// Model
		// Democratic Party
		int demAzVotes = 126;
		int demFlVotes = 32;
		int demVrVotes = 230;
		int demTxVotes = 21;
		int demGrVotes = 200;
		
		// Republican Party
		int repAzVotes = 152;
		int repFlVotes = 85;
		int repVrVotes = 121;
		int repTxVotes = 215;
		int repGrVotes = 13;
		
		// So, for 5 regions we are ok to store data as Single Value Containers
		// But when data is in high volumes, it will be a challenge to store and maintain

		// Controller
		// Logical
		int demVotesCount = demAzVotes + demFlVotes + demVrVotes + demTxVotes + demGrVotes;
		int repVotesCount = repAzVotes + repFlVotes + repVrVotes + repTxVotes + repGrVotes;
		
		// Adding 5 values is Ok. But if we have to add so many values it can be a challenge
		
		if(demVotesCount > repVotesCount){
			System.out.println("Democratic Party Wins by "+(demVotesCount-repVotesCount)+" Votes");
		}else{
			System.out.println("Republican Party Wins by "+(repVotesCount - demVotesCount)+" Votes");
		}
		
		// 2nd Way : Using Reference Type : int array |  Data Storage as in Multi Value Container
		// Data is stored as in indexes
					//	   0     1   2   3    4
		int[] demVotes = {126, 32, 230, 21, 200}; // Array
		int[] repVotes = {152, 85, 121, 215, 13}; // Array
		
		//  demVotes and repVotes are not arrays. They are Reference Variables
		//  They are pointing to Arrays in Heap Area.
		
		System.out.println("demVotes is: "+demVotes); // Some hashCode as in Hexadecimal 
		System.out.println("repVotes is: "+repVotes); // Some hashCode as in Hexadecimal
		
		// Read Elements of Array
		System.out.println("demVotes[0] : "+demVotes[0]);
		System.out.println("repVotes[0] : "+repVotes[0]);
		
		// Set the Data for any Element
		demVotes[0] = 621;
		repVotes[0] = 251;
		
		System.out.println("*******");
		// Re-Read
		System.out.println("demVotes[0] : "+demVotes[0]);
		System.out.println("repVotes[0] : "+repVotes[0]);
		
		System.out.println("*******");
		
		// Re-Initialize counters to 0
		demVotesCount = 0;
		repVotesCount = 0;
		
		// Size of Array
		System.out.println("demVotes size is: "+demVotes.length);
		System.out.println("repVotes size is: "+repVotes.length);
		
		// Read All
		for(int i=0;i<demVotes.length;i++){
			System.out.print(demVotes[i]+"  ");
			demVotesCount = demVotesCount + demVotes[i]; // Adding all the elements in demVotesCount 
		}
		
		System.out.println();
		System.out.println("*******");
		
		for(int i=0;i<repVotes.length;i++){
			System.out.print(repVotes[i]+"  ");
			repVotesCount = repVotesCount + repVotes[i]; // Adding all the elements in demVotesCount 
		}
		
		System.out.println();
		System.out.println("*******");
		
		if(demVotesCount > repVotesCount){
			System.out.println("Democratic Party Wins by "+(demVotesCount-repVotesCount)+" Votes");
		}else{
			System.out.println("Republican Party Wins by "+(repVotesCount - demVotesCount)+" Votes");
		}
		
		// 3rd Way : Using Reference Type : int array |  Data Storage as in Multi Value Container
		// Data is stored as in indexes
		// Array of Arrays
						 //   Az   Fl  Vr  Tx   Gr
						 //    0   1   2    3   4
		int[][] votes = {
							{126, 32, 230, 21, 200}, //0 -> Democratic Party
							{152, 85, 121, 215, 13}  //1 -> Republican Party
					    };
		// Solve the problem further !!
	}

}
