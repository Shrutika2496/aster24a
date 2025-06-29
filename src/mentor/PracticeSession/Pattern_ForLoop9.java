package mentor.PracticeSession;
//HOLLOW RECTANGLE
public class Pattern_ForLoop9 
{
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number");
//		int num=sc.nextInt();                                             //line=2 ast=2
          for (int line = 1; line <=4 ; line++) {  //2<=4
			for (int ast = 1; ast <=4 ; ast++) { //1<=4 //2<=4 //3<=4 //4<=4
				if(line==1 || line==4 || ast==1 || ast==4) { //F || F || F || F
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}

//* *  *  *
//*        *
//*        *
//* *  *  *

