package mentor.PracticeSession;
//write a program to Check Whether a Given Number is Prime or Not
import java.util.Scanner;

public class ForLoop_4 
{
	//prime no = divided by 1 and itself
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check weather it is prime or not");//
		int num=sc.nextInt(); //6
		int count=0;
		for(int i=2; i<num; i++) //2<6 //3<6 //4<6 //5<6 //
		{
			if(num%2==0) //2%2==0 T //3%2==0 F // 4%2==0 T //5%2==0 F
				count++; //1 //2
			//break; It is used to break next condition bcz we atleast get one count and we want zero count so next rest condition check nhi krega 
		}
		if(count==0)
		{
			System.out.println("This number is prime number");
		}
		else
		{
			System.out.println("This number is not prime number");
		}
	}


}

