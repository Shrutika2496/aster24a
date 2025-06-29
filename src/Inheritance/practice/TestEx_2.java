package Inheritance.practice;

public class TestEx_2 extends TestEx_1 {
	
	public void play() {
		System.out.println("I like to play cricket");
	}
	public static void main(String[] args) 
	{
		TestEx_2 t=new TestEx_2();
		t.Food();
		t.vehicle();
		t.play();
	}
}
