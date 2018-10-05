package co.edureka.collection;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// We can create a Nested Class or an Inner Class
	// Kind of Object in an Object i.e. Box within a Box -> Increasing Level of Encapsulation
	// CONATINMENT 
	
	// Helper, where managing code becomes easy for us !!
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
	
	// Inner Classes can have any access modifier, but outer classes can either be public or protected
	public class A{
		
	}
	
	private class B{
		
	}
	
	protected class C{
		
	}
	
	class D{
		
	}
}

class Employee{
	Address adrs; // Employee Has-A Reference to the Address Object
}

class Address{
	
}


public class NesetClassDemo {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.show();
		
		// Constructed an Internal Object
		// inner is a ref var which point to an Object created in an Outer Object.
		Outer.Inner inner = out.new Inner();
		inner.show();

	}

}
