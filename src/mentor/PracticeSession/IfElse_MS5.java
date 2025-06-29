package mentor.PracticeSession;

import java.util.Scanner;

//2.Write a program to input any alphabet and check whether it is vowel or consonant
public class IfElse_MS5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Character/Alphabet");
		char ch=sc.next().charAt(0); //chat at 0 means wo 0 th index ka jo bhi character he wo lega
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
		{
			System.out.println(ch+ " This is a vowel");
		}
		else
		System.out.println(ch+ " This is a Consonant");

	}

}
