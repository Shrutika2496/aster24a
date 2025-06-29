package mentor.PracticeSession;

import java.util.Scanner;

//1.Write a program to find maximum between two numbers
public class IfElse_MS4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two number to find Maximum number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+ " : a is the maximum number.");
		}
		else
		{
			System.out.println(b+ " : b is the maximum number.");
		}
		

	}

}
