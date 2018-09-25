
public class Loops {

	public static void main(String[] args) {
		
		int num = 5;
		int i = 1;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
				
		//1. while loop
		System.out.println("===While Loop===");
		num = 7;
		i = 1;
		
		while(i<=10){ // Condition is Checked and than we enter the loop
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		//2. for Loop
		System.out.println("=== For loop===");
		
		for(num=9,i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		System.out.println("------------");
		for(int n=11,j=1; j<=10; j++){
			System.out.println(n*j);
		}
		
		//3. doWhile
		System.out.println("===doWhile Loop===");
		num = 13;
		i = 100; // Having i as 100 condition is not satisfied. Even condition is false, do while will run once
		
		do{ 
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10); // / Condition is Checked and than we exit the loop

	}

}
