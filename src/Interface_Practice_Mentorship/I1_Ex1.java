package Interface_Practice_Mentorship;

public interface I1_Ex1 {
	//static int i=90;
	void m1();
//	void m2();
	void m3();
	
	default void m4() {
	}
//	
}
//by using interface we can achieve 100% abstraction.
//by default all methods of interface are abstract.
//in interface concrete method is not allowed.
//we can not create object of interface.
//blocks are not allowed in interfaces.
//interfaces can be implemented not extended.
//by default all variables in interfaces are public,static and final

//class-class=extends
//interface-class=implements
//class-interface=implements
//interface-interface=extends

//Can we write constructor in inteface??
//Ans==>we can not write constructor in inteface