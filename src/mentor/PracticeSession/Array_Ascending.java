package mentor.PracticeSession;

public class Array_Ascending 
{

	public static void main(String[] args) 
	{
		int[] x= {15,24,58,75,86,36};
		int temp=0;
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = i+1; j < x.length; j++) 
			{
				if(x[i]>x[j])  //ASSENDING ONLY CHANE (x[i]>x[j])				
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
			System.out.println(x[i]);
		}
	}

}
