package mentor.PracticeSession;

import java.util.Scanner;

public class Array_IndexEx 
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
		for (int index = 0; index <= x.length-1; index++) 
		{
			System.out.println(x[index]);
		}
	}
}
