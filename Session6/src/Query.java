class A{
	
	static int i = 10;
	
}

class B extends A{
	
	static int i = 100;
	
}
public class Query {

	public static void main(String[] args) {
		
		System.out.println("i in A is :"+A.i);
		System.out.println("i in B is :"+B.i);

	}

}
