package mentor.PracticeSession;

/**Assignment reverse pattern

 *  *  *  *  *
  *  *  *  *
   *  *   *
    *   *
      *
     
 **/ 
public class Pattern_ForLoop5 {

	public static void main(String[] args) 
	{
		//System.out.println("Enter number");
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();//5
		
		for (int line = 1; line <= 5; line++) {
		for (int space =1 ; space < line; space++) {
			System.out.print(" ");
			
		}
		  // char x = 'k';
		
			for (int ast = 5; ast >= line; ast--) {
					System.out.print("* ");
			}
			System.out.println();
		}

	}

}
