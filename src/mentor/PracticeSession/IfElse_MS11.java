package mentor.PracticeSession;

import java.util.Scanner;

//Write a program to check whether a number is even or odd
public class IfElse_MS11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check It is Even or Odd");
		int num=sc.nextInt();


		if(num%2==0)
		{
			System.out.println(num+ " This number is even number");
		}
		else
		{
			System.out.println(num+ " This number is odd number");
		}
	}

}
