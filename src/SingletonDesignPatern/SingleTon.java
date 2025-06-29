package SingletonDesignPatern;

public class SingleTon {

	int x=10;
	private  final static SingleTon b=new SingleTon();   //crete only one object
	
	public static SingleTon getUserAnuja() {
		return new SingleTon();
	}

	//	static {    //static block
	//		
	//	}

	private SingleTon() {  //constructor private
		// TODO Auto-generated constructor stub
	}

	public void m1() {
		// TODO Auto-generated method stub
	}

	public void m2() {
		// TODO Auto-generated method stub
	}

	public void m3() {
		// TODO Auto-generated method stub
	}
}

