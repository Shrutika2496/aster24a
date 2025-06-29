package mentor.PracticeSession;

import java.util.Scanner;

//Fibonacci  series
public class WhileLoop_MS9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto which you have find Fabonacci");
		int n=sc.nextInt(); //end number e.g=5
		int num1=0;
		int num2=1;
		System.out.println(num1+" ");
		System.out.println(num2);
		int i=1; //start
		while(i<=n) //2<=5 3<=5 4<=5
		{
			int result=num1+num2;
			num1=num2;
			num2=result;
			i++;  //3 4 5
			System.out.print(""+result );
		}
	}

}
//   num1   num2   Result
// 0  0+1   1+1     2+1    3+2   5+3  5+8
// 0   1    1        2  3  5   8   13