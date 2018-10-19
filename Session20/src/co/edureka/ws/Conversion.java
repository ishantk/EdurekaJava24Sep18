package co.edureka.ws;

import java.util.Date;

// Web Service
public class Conversion {
	
	// Web Methods : They must be public, They must have Inputs
	public String sayHello(String name){
		Date date = new Date();
		String str = "Hello, "+name+" Its: "+date;
		return str;
	}
	
	public int feetToInches(int feet){
		int inches = feet * 12;
		return inches;
	}
	
	public int mtrsToCms(int mtrs){
		int cms = mtrs * 100;
		return cms;
	}
	
	public String registerUser(String name, String phone, String email){
		Date date = new Date();
		// Write some DB operation here...
		String str = "Hello, "+name+" You are registered with us at : "+date;
		return str;
	}

}
