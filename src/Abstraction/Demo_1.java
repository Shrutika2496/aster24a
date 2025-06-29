package Abstraction;

public abstract class Demo_1 {
	//can we crate blank final variable in abstract class??
	final int x; // declaration blank final variable
	int y; //we can create instance variable in abstract class
	static int z; //we can create static variable in abstract class
	public  Demo_1() //constructor Que-Constructor abstract ho skta he kya??                               //no bcz constructor have body and abstract method have no body
	{
		System.out.println("");
		x=10; //Initialization blank final variable

		//Demo_1 d1=new Demo_1(); *** imp does not create object of abstract class due to new keyword
	}

	{   //instacne block likh skte he but call nhi kr skte due to object creation
		System.out.println("Instance block"); //
	}

	static{   //Static block
		System.out.println("Static block"); //
	}

	public void m1() { //concrete
		System.out.println("I am a m1 method");
		int j=20;  //we can create local variable in abstract class
	}
	public static void m2() { //concrete method ke sath static and private likh skte he
		System.out.println("I am a m2 method");
	}

	public abstract void m3(); //abstract method ke sath static and final nhi laga skte
	public abstract void m4();//abstract method


}

//methods= abstact method and concrete method
//modifiers=public,private,protected,default
///in abstract class we use public,protected and default modifier
//we can not use protected modifier in abstract class


