package mentor.PracticeSession;


//1.Write a program to print all even numbers between 1 to 100
public class ForLoop_1 {

	public static void main(String[] args) 
	{
		for(int i=1; i<=100; i++)
			if(i%2==0)
			{
				System.out.println("Even number " +i);
			}
	}
}
