package mentor.PracticeSession;

import java.util.Scanner;

public class Array_PrimeNumbers 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt(); //8
		System.out.println("Enter the elements array");
		int[] x=new int[size];
		for (int i = 0; i < x.length; i++) 
		{
			x[i]=sc.nextInt();
		}

		int num=0;
		for(int i=0; i<x.length; i++) //2<6 //3<6 //4<6 //5<6 //
		{
			if(x[i]%2==0) //2%2==0 T //3%2==0 F // 4%2==0 T //5%2==0 F
				num++; //1 //2
			//break; //It is used to break next condition bcz we atleast get one count and we want zero count so next rest condition check nhi krega 
		}
		if(num==0)
		{
			System.out.println("This number is prime number");
		}
		else
		{
			System.out.println("This number is not prime number");
		}
	}

}
