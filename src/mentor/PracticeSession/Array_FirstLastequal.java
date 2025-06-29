package mentor.PracticeSession;

public class Array_FirstLastequal 
{

	public static void main(String[] args) 
	{
		int[] arr= {4,2,8,9,1,6,7,6};
		int first=arr[0];
		int last=arr[arr.length-1];
		if(first+last==10) 
		{
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}

	}
//	int[] arr= {4,2,8,9,1,6,7,6};
//	
//	int first=arr[0];
//	int last=arr[arr.length-1]; //int last=arr[arr.length-1];
//
//	if(first==last)
//	{
//		System.out.println("Equals");
//	}
//	else
//	{
//		System.out.println("Not Equals");
//	}
//}
}
