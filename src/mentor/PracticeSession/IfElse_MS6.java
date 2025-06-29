package mentor.PracticeSession;

import java.util.Scanner;

//Write a program to check whether a number is negative, positive or zero
public class IfElse_MS6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check a number is negative, positive or zero");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("Entered number is positive");
		}
		else if(a<0)
		{
			System.out.println("Entered number is negative");
		}
		else
		{
			System.out.println("Entered number is Zero");
		}
	}

}
