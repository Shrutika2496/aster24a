package Abstraction;

public class SBI extends RBI {

	@Override
	public void OpenAccount(String AdharNo, String Pan) 
	{
		System.out.println("Open Account in SBI");
	}
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		s.m1();
	}		
}
