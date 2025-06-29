package mentor.PracticeSession;

import java.util.Scanner;

//Swap two numbers without temp variable
public class WhileLoop_MS8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for 1st number a :"); //2
		int a=sc.nextInt();
		System.out.println("Enter the value for 2nd number b :");  //5
		int b=sc.nextInt();
		
		a=a+b; //a=2+5 a=7
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a is : " +a);
		System.out.println("Value of b is : " +b);
		

	}

}
