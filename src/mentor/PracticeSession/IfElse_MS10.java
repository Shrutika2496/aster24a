package mentor.PracticeSession;
//1.Write a program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;

public class IfElse_MS10 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check It is divisible by and 11 or not");
		int x=sc.nextInt();
		if(x%5==0 && x%11==0 )
		{
			System.out.println(x+ " Number is Divisible by 5 and 11");
		}
		else
		{
			System.out.println(x+ " Number is not Divisible by 5 and 11");
		}
		
		
	}

}
