package co.edureka.exceptions;

import java.io.IOException; // Checked Exception

// User Defined - CHECKED EXCEPTION
class MyBankingException extends Exception{
	
	MyBankingException(String message){
		super(message);
	}
	
	// Logics
	// eg: Saving some data in files if program is crashing: Logging
}

//User Defined - UNCHECKED EXCEPTION
class YourBankingException extends RuntimeException{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int balance = 10000;
	int transaction = 0;
	int attempts = 0;
	
	void withdraw(int amt) throws IOException, MyBankingException{
		System.out.println();
		
		transaction++;
		balance = balance - amt;
		
		System.out.println(">> Trnasaction "+transaction+" started");
		
		if(balance<0){
			attempts++;
			balance = balance + amt;
			System.out.println(">> Withdrawl **Failure** !! Balance is LOW: \u20b9"+balance);
		}else{
			System.out.println(">> Withdrawl Done !! New Balance is: \u20b9"+balance);	
		}
		
		if(attempts == 3){
			System.out.println("=="+attempts+" Unsuccessfull Attempts Made==");
			
		
			// Throwing UNCHECKED EXCEPTION
			//ArithmeticException aRef = new ArithmeticException("Balance is LOW");
			//throw aRef; 	// Here Compiler will not give any error while throwing, UnChecked by Compiler
			
			//throw new ArithmeticException("Balance is LOW");
			
			
			// Throwing CHECKED EXCEPTION
			//IOException io = new IOException("Balance is LOW");
			//throw io; 		// Compiler will give an error while throwing, Checked By Compiler
			
			MyBankingException mRef = new MyBankingException("Balance is LOW");
			throw mRef;
		}
		
		System.out.println();
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		System.out.println(">> Banking Started");

		Banking bRef = new Banking();
		
		// Having such a high frequency of transactions, which will eventually result in a failure, will consume bank's resources
		
		// Now, in case withdraw method throws IOException, compiler will check and tell us to surround code with try catch
		
		try{
			for(int i=1;i<=1000;i++){
				bRef.withdraw(3000); 
			}
		}catch(Exception e){
			System.out.println("Some Exception: "+e);
		}
		
		System.out.println(">> Banking Finished");
	}

}
