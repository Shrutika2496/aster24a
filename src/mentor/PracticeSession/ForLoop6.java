package mentor.PracticeSession;
//to find table using for loop
import java.util.Scanner;

public class ForLoop6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int result;
		for (int i = 1; i <=10 ; i++) {
			result=num*i;
			System.out.println(result);

		}
	}

}
