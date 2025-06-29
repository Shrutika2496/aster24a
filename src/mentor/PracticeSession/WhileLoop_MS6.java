package mentor.PracticeSession;

import java.util.Scanner;
//Swapping of number using Temperory variable
public class WhileLoop_MS6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a"); //30
		int a=sc.nextInt();
		System.out.println("Enter number b"); //20
		int b=sc.nextInt();
		int temp;
		
		temp=a; //temp=a temp=30
		a=b;  // a=20
		b=temp;
		System.out.println("the swapping of two number a= "+a +" and b=" +b);
		
		
		
		
		

	}

}
