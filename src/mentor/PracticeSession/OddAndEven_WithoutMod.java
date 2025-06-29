package mentor.PracticeSession;
import java.util.Scanner;

public class OddAndEven_WithoutMod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check even and odd");
		int Num=sc.nextInt();
		int quotient = Num / 2;
		if (quotient * 2 == Num) {
			System.out.println(Num + ": The Given Number is Even number.");
		} else {
			System.out.println(Num + ": The Given Number is Even number.");
		}
		//2nd way
		//		if((Num/2)*2==Num) // (20/2)*2== num=20  20==20 print even || (3/2)*2== num 3==
		//        {
		//            System.out.println(Num+ ":The Given Number is Even number");
		//        }
		//        else
		//        {
		//        	System.out.println(Num+ ":The Given Number is Odd number");
		//        }	
	}
}
