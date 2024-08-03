package Revison;

public class h3 extends h1 {
	int fees;
	public h3(int rollno,int fees) {
		super(rollno);
		this.fees=fees;
	}
	void display() {
		super.display();
		System.out.println("The fees is"+fees);
		
	}
public static void main(String[] args) {
	h3 h=new h3(1,40000);
	h2 hi2=new h2(2,"Dharani");
	h.display();
	hi2.display();
}
}
