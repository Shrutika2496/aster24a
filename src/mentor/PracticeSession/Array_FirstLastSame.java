package mentor.PracticeSession;

public class Array_FirstLastSame 
{
	public static void main(String[] args)
	{
		int[] arr= {6,2,8,9,1,6,7,6};
		int first=arr[0];
		int last=arr[arr.length-1];
		
		if(arr[0]==arr[arr.length-1])
		{
			System.out.println("First and last number is same");
		}
		else
		{
			System.out.println("First and last number is not same");
		}
	}

}
