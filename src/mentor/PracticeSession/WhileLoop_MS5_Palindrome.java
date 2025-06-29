package mentor.PracticeSession;

import java.util.Scanner;
//palindrome
//Write a program to reverse the given digit
public class WhileLoop_MS5_Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number"); //123- 321
		int num=sc.nextInt();
		int a=num;
		int rev=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse digit is :"  +rev);

		if(a==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
