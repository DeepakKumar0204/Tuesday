package Revison;

public class h2 extends h1 {
	String name;
	public h2(int rollno,String name) {
		super(rollno);
		this.name=name;
	}
	void display() {
		super.display();
		System.out.println("The name is "+name);
	}

}
