package Revison;

public class abstraction2 extends abstraction{
	public void car() {
		System.out.println("This is abstract classs implementation");	
	}
public static void main(String[] args) {
	abstraction2 a=new abstraction2();
	a.car();
	a.something();
}
}
