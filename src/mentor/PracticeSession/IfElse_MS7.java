package mentor.PracticeSession;

import java.util.Scanner;

//.Write a program to check whether a character is alphabet or not
public class IfElse_MS7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character to check it is an alphabet or not");
		char ch=sc.next().charAt(0);
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			System.out.println(ch+ " This character is a alphabet");
		}
		else
		{
			System.out.println(ch+ " This character is not alphabet");
		}
				
	}

}
