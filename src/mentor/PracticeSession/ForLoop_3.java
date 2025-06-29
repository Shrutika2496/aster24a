package mentor.PracticeSession;

import java.util.Scanner;
//Write a program to find the sum of all even numbers between 1 to n(n means dynamic)
public class ForLoop_3 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find sum upto");//
		int num=sc.nextInt(); //4
		int result = 0;   //0
	
		for (int i = 1; i <=num ; i++) //i=1 1<=4; i=2 2<=4
		{
			if(i%2==0) //1%2==0 no / 2%2==0 yes
			{
	
				result=result+i; //0+1=1 / 0+2=2
			}			
		}
				System.out.println(result);
		
	}

}

//1 to n
//1 to 10
//1+2+3+4