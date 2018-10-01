// Generalized Structure
/*class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(){
		System.out.println("Cab Booked !! Arriving Soon !!");
	}
}*/

// Refine Run Time Polymorphism
// For which we cannot create objects. But Run Time Environment (JVM) can !!
/*abstract class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// Abstract method will have no definition. can only be created in an abstract class !!
	// This is a Rule which must be defined by the Children
	abstract void bookCab();
	
	void fun(){
		System.out.println("This is fun");
	}
}*/

//Refine Run Time Polymorphism : To the Best Possible
interface Cab{
	
	// No Constructor Allowed: Neither we nor JVM can Create Objects
	/*
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// Methods are by default public abstract
	void bookCab(); //-> public abstract void bookCab();
	// bookCab as a rule
}

class UberGo implements Cab{ //extends Cab{ // UberGo IS-A Cab
	
	UberGo(){
		System.out.println(">> UberGo Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("UberGo Booked for \u20b9 100. Arriving Soon !!");
	}
}

class UberX implements Cab{ //extends Cab{ // UberGo IS-A Cab
	
	UberX(){
		System.out.println(">> UberX Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("UberX Booked for \u20b9 200. Arriving Soon !!");
	}
}

class UberMoto implements Cab{ //extends Cab{ // UberGo IS-A Cab
	
	UberMoto(){
		System.out.println(">> UberMoto Object Constructed");
	}
	
	public void bookCab(){
		System.out.println("UberMoto Booked for \u20b9 50. Arriving Soon !!");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		//Cab cab = new Cab();
		//cab.bookCab();
		
		//UberGo go = new UberGo();
		//go.bookCab();
		
		// Polymorphic Statement
		
		// Reference Variable cab of Parent can point to the object of Child
		// Reference Variable cab of Interface can point to the object which implements it !!
		Cab cab = new UberGo();
		cab.bookCab();
		
		System.out.println();
		
		cab = new UberX();
		cab.bookCab();
		
		System.out.println();
		
		cab = new UberMoto();
		cab.bookCab();
		
		// Polymorphism - More than 1 form
		// RUN TIME POLYMORPHISM
		// Same Ref Var cab can point to Object of UberGo, UberX and UberMoto
		// Same method bookCab is giving us different outputs  (Which bookCab method i.e. Parent ot Child shall be executed is decided at run time)
		
		System.out.println();
		
		// Having Cab object will have no meaning
		//cab = new Cab();
		//cab.bookCab();

	}

}
