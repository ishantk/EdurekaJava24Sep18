
public class Overloading {
	
	// Overloading -> Method Name is Same, and Inputs are always Unique (Inputs are always different)
	// Rules:
	// 1. Method Name should be Same
	// 2. Inputs must be different
		//2.1 Number of Inputs
		//2.2 Type of Inputs
		//3.3 Sequence of Inputs
	// 3. Return Type has no role to play
	
	void area(int radius){
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle with radius "+radius+" is "+area);
	}
	
	// changing just the name of input is not overloading
	/*void area(int myRadius){
		double area = 3.14 * myRadius * myRadius;
		System.out.println("Area of circle with radius "+myRadius+" is "+area);
	}*/
	
	// having return type different and inputs same is not overloading
	/*double area(int radius){
		double area = 3.14 * radius * radius;
		return area;
	}*/
	
	void area(double radius){
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle with radius "+radius+" is "+area);
	}
	
	void area(int length, int breadth){
		System.out.println("Area of Rectangle with length "+length+" and breadth "+breadth+" is "+(length * breadth));
	}
	
	void area(double length, double breadth){
		System.out.println("Area of Rectangle with length "+length+" and breadth "+breadth+" is "+(length * breadth));
	}
	
	void area(int length, double breadth){
		System.out.println("Area of Rectangle with length "+length+" and breadth "+breadth+" is "+(length * breadth));
	}
	
	void area(double length, int breadth){
		System.out.println("Area of Rectangle with length "+length+" and breadth "+breadth+" is "+(length * breadth));
	}
	
	

	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		oRef.area(5);
		oRef.area(7.75);
		oRef.area(12, 13);
		oRef.area(3.3, 3.3);
		oRef.area(10, 2.2);
		oRef.area(10.10, 2);

	}

}
