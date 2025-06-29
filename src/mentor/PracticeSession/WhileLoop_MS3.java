package mentor.PracticeSession;

import java.util.Scanner;

///1.Write a program to print reverse tables
public class WhileLoop_MS3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int i=10, result;
		while(i>=1)  //start point=10, end point=1 // decrement
		{
			result=num*i;
			System.out.println(result);
			i--;
		}
		

	}

}
