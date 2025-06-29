package mentor.PracticeSession;

import java.util.Scanner;

public class Array_SumOfArray 
{
	public static void main(String[] args) 
	{
		//		int[] x= {1,3,6,4,5,2}; //21
		//		int sum=0;
		//		for (int i = 0; i < x.length; i++) {                   //Sum of array
		//			sum=sum+x[i];
		//		}
		//System.out.println(sum);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt(); //8
		System.out.println("Enter the elements array");
		int[] x=new int[size];
		for (int i = 0; i < x.length; i++) 
		{
			x[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < x.length; i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
	}

}
