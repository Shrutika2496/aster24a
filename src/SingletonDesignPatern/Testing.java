package SingletonDesignPatern;

public class Testing {
	public static void main(String[] args) {
		SingleTon s1=SingleTon.getUserAnuja();

		//Singleton s2=Singleton.getUser();
		SingleTon s2=SingleTon.getUserAnuja();
		s1.m1();
		s1.m2();
		s1.m3();

		System.out.println(s1);
		System.out.println(s2);
		if(s1==s2) { 
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}
}
