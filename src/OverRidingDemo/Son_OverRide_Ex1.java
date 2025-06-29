package OverRidingDemo;

public class Son_OverRide_Ex1 extends ParentOverRide_Ex1 {
	@Override
	public void MixVage() {
		System.out.println("I like Butter paneer");
	}
	@Override
	public void Roti() {
		System.out.println("I like Butter naan");
	}
	@Override
	public void Coldriks() {
		System.out.println("I like coca cola");
	}
}

