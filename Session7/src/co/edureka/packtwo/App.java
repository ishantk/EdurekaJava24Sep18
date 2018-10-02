package co.edureka.packtwo;

import co.edureka.packone.One; // import so that we can use it outside the package
//import co.edureka.packone.Two; // default class cannot be imported. default is accessible only within the package

// Inheritance Across Package
// private and default isnt inherited
// only public and protected is inherited !!
// protected after inheritance behaves like private
class Three extends One{
	
	void show(){
		protShow();   // access protected members indirectly
		//pvtShow();  // error, as not inherited
		//defShow();  // error, as not inherited
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		
		// Access Methods outside the package:
		//oRef.pvtShow(); 		// private is accessible only within the same class
		//oRef.defShow();   	// default is accessible only within the same package
		//oRef.protShow();		// protected is accessible only within the same package, but inheritable outside the package
		//oRef.pubShow();		// public is accessible everywhere, within or outside i.e. anywhere
		
		Three tRef = new Three();
		tRef.pubShow();
		//tRef.protShow(); // behave as private
		tRef.show();

	}
	
	// Least Accessible			> 			Most Accessible
	//  private	>  default	>	protected 	>	public

}
