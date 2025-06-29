package OverRidingDemo;

public class Drivver_OverRide_Ex1 {

	public static void main(String[] args) {
		ParentOverRide_Ex1 p=new ParentOverRide_Ex1();
		p.MixVage();
		p.Roti();
		p.Rice();
		p.Coldriks();
		p.Sweet();
		System.out.println();
		Son_OverRide_Ex1 s=new Son_OverRide_Ex1();
		s.Roti();
		s.Coldriks();
		s.MixVage();
		System.out.println();
		
		Daughter_OverRide_Ex1 d= new Daughter_OverRide_Ex1();
		d.Rice();
		d.Roti();
		d.Sweet();
	
	}

}
