package mentor.PracticeSession;

import java.util.Scanner;
public class Pattern_ForLoop4 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();

		for(int line=1; line<=num; line++)  //line<=5
		{
			for (int space =num-1; space >=line; space--) 
			{
				System.out.print(" ");
				
			}	

			char x='a';
			//int n=1;
			for (int ast =1; ast<=line; ast++) 
			{
				if(line%2==0)
				{
					System.out.print("* ");
					//x++;
				}
				else
				{
					System.out.print(x+ " ");
					x++;
				}			
			}
			System.out.println();
		}		
	}
}
// 1,3 5th line is chara = odd 
// 2,4 line is ast      = even
//        a
//      *   *
//     a  b   c
//    *  *  *  *
//   a  b  c  d   e

