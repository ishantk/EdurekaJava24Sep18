
public class DataOperations {

	public static void main(String[] args) {
		
		// Controller -> Logical Processing in Data !!
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2; // Addition
		
		System.out.println(num1+" and "+num2+" addition is "+num3);
		
		int num4 = num1 % 3;  // Remainder
		System.out.println("num4 is "+num4);
		
		//num1++;  // -> num1 = num1 + 1;
		++num1;    // -> num1 = num1 + 1;
		System.out.println("num1 now is: "+num1);
		
		System.out.println("is num1 smaller than num2 ? "+ (num1 < num2) );
		
		System.out.println("is "+num3+" greater than "+num1+" and "+num2+" both ? "+ ( (num3 > num1) && (num3 > num2) ) );
		
		
		int maths = 90;
		int physics = 80;
		int chemistry = 85;
		
		double avg = ( maths + physics + chemistry ) / 3;
		System.out.println("Avreage is: "+avg);
		

	}

}
