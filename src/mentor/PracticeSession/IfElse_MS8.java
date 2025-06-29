package mentor.PracticeSession;
//Write a program to find maximum between three number
import java.util.Scanner;

public class IfElse_MS8 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three number to find Maximum number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=sc.nextInt();
		int x;
		
		x=(a>b)? (a>c ? a:c): (b>c? b:c);
		System.out.println(x);
		
		
		
	}
}
