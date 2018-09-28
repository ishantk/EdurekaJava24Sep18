// Structure of an Object
// Whatever we are writing in class is in real the property of object
class PaintWindow{
	
	// Attributes: Belongs to Object
	int width;
	int height;
	
	// Special Method : Constructor 
	// Are executed automatically when object is created !!
	
	// Default Constructor : Which compiler generates one for us automatically with default data to attributes
	/*PaintWindow(){
		width = 0;
		height = 0;
	}*/
	
	// We will have default data for attributes if user didn't give any data to the attributes
	// Object initialization : Attributes of an object are initialized with some default values
	PaintWindow(){
		width = 100;
		height = 200;
	}
	
	// Parmeterized Constructor: Constructor with Arguments/Parameters/Inputs
	PaintWindow(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	// Methods : Belongs to Object
	void setWindow(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	void showWindowDetails(){
		System.out.println("Paint Window with "+width+" width and "+height+" height is created !!");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		PaintWindow window1 = new PaintWindow();
		window1.setWindow(600, 600);
		window1.showWindowDetails();
		
		// Here, we are not setting the details !! We are not writing the data !!
		PaintWindow window2 = new PaintWindow();
		window2.showWindowDetails();
		
		// Here, while creating an object we are passing width and height
		PaintWindow window3 = new PaintWindow(1024, 1086);
		window3.showWindowDetails();
		
		// Having different constructors, we can create different objects with some default values !!
		
	}

}
