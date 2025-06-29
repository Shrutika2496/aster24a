package mentor.PracticeSession;

public class MultiDimenArray_1  //reverse array
{

	public static void main(String[] args) 
	{
		int[][] x= {{1,2,3},{4,5},{6,7,9}};
		for (int p=2; p >=0; p--) 
		{
			for (int c= x[p].length-1; c >= 0; c--) 
			{
				System.out.println(x[p][c]);
			}
			System.out.println();
		}
	}
}
