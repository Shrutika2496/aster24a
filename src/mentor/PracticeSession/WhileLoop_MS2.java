package mentor.PracticeSession;
import java.util.Scanner;
///1.Write a program to print tables
public class WhileLoop_MS2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		int num=1;
		int result;
		while(num<=10)
		{
			result=i*num;
			System.out.println(i +"X"+ num +"=" + result);  //2*1=2
			num++;
		}
	}
}
