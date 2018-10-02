package co.edureka.packone;

public class App {

	public static void main(String[] args) {
		
		// Object of public class in the App in the same package
		One oRef = new One();
		
		// Object of default class in the App in the same package		
		Two tRef = new Two();
		
		// Access Methods within package:
		//oRef.pvtShow(); // private is accessible only within the same class
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		//tRef.pvtShow(); // private is accessible only within the same class
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
		// either class is public or default, within the same package all the access modifiers can be accessed other than private
		
	}

}
