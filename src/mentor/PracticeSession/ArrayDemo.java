package mentor.PracticeSession;

public class ArrayDemo 
{
int[] x= {10,20,30,40,50,60,91};  //Using Literal
	
	byte[] z= {1,11,23,98};  //Ok
	//byte[] z= {1,11,23,98,780}; //byte=-128 to 127
	char[] ch= {'a','x','z','p'};
	//char[] ch= {'a','x','z',65}; //by default all numeric con  //97 67 89 98
	int[] p= {}; //0 size array
	
	int[] y=new int[6];               //using new keyword   
	int[] y1=new int[8]; 
	int[] q=new int['a'];
}
