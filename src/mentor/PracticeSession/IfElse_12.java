package mentor.PracticeSession;
import java.util.Scanner;

public class IfElse_12 {
//Write a program to check whether a year is leap year or not
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year check whether a year is leap year or not");
		int year=sc.nextInt();
		if((year%4==0) && (year %100 !=0 || year%400 ==0))
		{
			System.out.println(year+ " This is a leap year");
		}
		else 
		{
			System.out.println(year+ " This is not leap year");
		}
		

	}

}
