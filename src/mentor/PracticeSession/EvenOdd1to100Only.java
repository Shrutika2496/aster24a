package mentor.PracticeSession;

import java.util.Scanner;

public class EvenOdd1to100Only {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number from 1 to 100 range to check even or odd");
		int num=sc.nextInt();
		if(num>0 && num <=100)
		{
			if(num%2==0){
				System.out.println(num +" This is Even Number");
			}
			else{
				System.out.println(num +" This is Odd Number");
			}			
		}
		else {
			System.out.println("You have entered invalid number");
		}
	}
}
