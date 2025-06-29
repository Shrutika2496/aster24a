package Abstraction;

public abstract class RBI {  //parent
 public abstract void OpenAccount(String AdharNo, String Pan); 
 
 public void m1() { //concrete
	System.out.println("I am m1 method");
}
}
