package Revison;

public class in3 extends in2{
	int fees;
	public in3(int rollno,String name,float m1,float m2,float m3,int fees) {
		super(rollno,name,m1,m2,m3);
		this.fees=fees;
	}
	void display3() {
		System.out.println("The fees is" +fees);
	}
public static void main(String[] args) {
	in3 in=new in3(1,"Deepak",30,40,50,50000);
	in2 i2=new in2(2,"Dharani",20,40,50);
	in1 i3=new in1(3,"Kaushal");
	i2.display2();
	i2.display();
	in.display();
	in.display2();
	in.display3();
	i3.display();


}
}
