package mentor.PracticeSession;

public class Array_Occurance1 
{

	public static void main(String[] args) 
	{
	int [] x= {15,24,58,75,58,36,58};
	int temp=0;
	for (int i = 0; i < x.length; i++) 
	{
		if(x[i]==58)
		{
			temp++;
		}
	}
	System.out.println(temp);

	}

}
