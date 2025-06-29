package mentor.PracticeSession;

public class MultiDimenArray_2 
{
	public static void main(String[] args)
	{
		{
			int[][] x= {{1,2,3},{4,5},{6,7,9}};
			for (int p=0; p <=2; p++) 
			{
				for (int c=0; c <x[p].length; c++) 
				{
					System.out.println(x[p][c]);
				}
				System.out.println();
			}
		}
	}
}
