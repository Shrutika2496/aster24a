package mentor.PracticeSession;

import java.util.Scanner;

//Write a program to find factorial of any number
public class WhileLoop_MS4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number/Digit to find factorial");
		//long num=sc.nextInt(); //4
		long num=sc.nextInt();
		long x=1;
		while(num>=1) //4>=1 // 3>=1 // 2>=1
		{
			x=num*x;  //4*1=4 // 3*4=12 // 2*12=24 // 1*24=24
			num--;  //3 //2 //1
		}
		System.out.println("Factorial  :"  +x);
	}
	
}


//5*4*3*2*1=20*3=60*2=120*1=120