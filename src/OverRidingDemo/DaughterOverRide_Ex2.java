package OverRidingDemo;

public class DaughterOverRide_Ex2 extends ParentOverRide_Ex2 {
	@Override
	public int Maths1(int x, int y) {
		System.out.println(5*5);
		return y;
	}
}
