package OverRidingDemo;

public class ParentOverRide_Ex2 {

	public int Maths(int a,int b) {
		int result=a+b;
		System.out.println(result);
		return result;
	}

	public int Maths1(int x,int y) {
		int result=x*y;
		System.out.println(result);
		return result;
	}

	public int Maths2(int c,int d) {
		int result=c/d;
		System.out.println(result);
		return result;
	}
	public int Maths3(int e,int f) {
		int result=e-f;
		System.out.println(result);
		return result;
	}
}



