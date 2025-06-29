package mentor.PracticeSession;

import java.util.Scanner;

//Add the digit of the given number
public class WhileLoop_MS7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to add the digit of it :");
		int num=sc.nextInt();
		int rem; 
		int result=0;
		while(num>0)  //234>0 //23>0  // 2>0 //0.5>0 false
		{
			rem=num%10; //234%10 =4  //23%10=3  //2%10=2
			result=result+rem; //0+4=4  //4+3=7 //7+2=9
			num=num/10; //234/10 =23 // 23/10=2 // 2/10=0.5
		}
		System.out.println("The digit sum of a number is :" +result);
		
		
	}

}
