package OverRidingDemo;

public class Daughter_OverRide_Ex1 extends ParentOverRide_Ex1 {

	@Override
	public void Rice() {
		System.out.println("I like Veg Pulao");	
	}
	@Override
	public void Roti() {
		System.out.println("I like Butter roti");
		
	}
	@Override
	public void Sweet() {
		System.out.println("I like Gulab Jamun");
	}
}


