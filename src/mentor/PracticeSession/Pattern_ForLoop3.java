package mentor.PracticeSession;
import java.util.Scanner;
public class Pattern_ForLoop3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		{
			for(int line=1; line<=num; line++)
			{
				for (int space=num-1; space>=line; space--)
				{
					System.out.print(" ");
				}
				for(int ast=1; ast<=line; ast++)
				{
					System.out.print("* ");	
				}
				System.out.println();
			}
		}
	}
}


