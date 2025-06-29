package Abstraction;

public class CustomerBank {

	public static void main(String[] args) {
		SBI s=new SBI(); 
		s.OpenAccount("123456789", "AKSPU7879J");
		//s.m1(); child ke obj se call hoga parent ke obj se nhi
		AXIS a=new AXIS();
		a.OpenAccount("45", "m1");
		HDFC h=new HDFC();
		h.OpenAccount("33", "22");
		//RBI r=new RBI(); //Can not create the object (instantiate the type RBI) because of abstract class

	}

}
