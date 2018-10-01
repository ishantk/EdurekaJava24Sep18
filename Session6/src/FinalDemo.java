// final class cannot be inherited
final class Parent{
	
	// final method cannot be overrided by the Child !!
	final void fun(){
		System.out.println("This is fun in Parent");
	}
}

class Child{// extends Parent{
	/*void fun(){
		System.out.println("This is fun in Child");
	}*/
}


public class FinalDemo {

	public static void main(String[] args) {
		
		int x = 10;
		x = 100; // data can be modified
		
		// whose value cannot change, acts like a constant !!
		final int y = 10;
		//y = 100; // data cannot be modified
	}

}
