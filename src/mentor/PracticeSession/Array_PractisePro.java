package mentor.PracticeSession;

public class Array_PractisePro 
{
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		int sum=0;
		for (int i = 0; i < num.length; i=i+2)  //find the addition of next to next number(+2)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);


			String[] cars= {"swift","ertica","bmw","nexon"};
		System.out.println(cars[1]);
		cars[1]="honda city";
				for (int i = 0; i < cars.length; i++) {
					System.out.println(cars[i]);
				}
	}
}
