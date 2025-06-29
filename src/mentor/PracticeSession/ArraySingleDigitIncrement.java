package mentor.PracticeSession;

public class ArraySingleDigitIncrement 
{
	public static void main(String[] args) 
	{
		int	[] arr= {6,3,9,1,2,8,4,5};
		for (int i = 0; i < arr.length; i++)  //find the addition of next to next number(+2)
		{
			System.out.println(arr[i]+1);
		}
	}
}
