package mentor.PracticeSession;

public class Array_MaxNumber 
{
	public static void main(String[] args) 
	{

		int[] x= {15,24,58,75,86,36};
		int max=x[0];
		for (int i = 0; i < x.length; i++) {
			if(max<x[i]) {
				max=x[i];
			}
		}
		System.out.println(max);


		//			int[] x= {15,24,58,75,86,36};
		//			int min=x[0];
		//			for (int i = 0; i < x.length; i++) {
		//				if(min<x[i]) {
		//					min=x[i];
		//				}
		//			}
		//			System.out.println(min);
	}


	//		int x=3;
	//		System.out.println(++x * 8 * x++);

	//InterView Question
	//	int a=5;
	//	int b=~a; //tilde  
	//	System.out.println(a=~a);

	//System.out.println(a+" "+b);
}

