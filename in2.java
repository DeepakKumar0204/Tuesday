package Revison;

public class in2 extends in1{
	float m1,m2,m3;
	public in2(int rollno,String name,float m1,float m2,float m3) {
		super(rollno,name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void display2() {
		float avg=(m1+m2+m3)/3;
		System.out.println("The average of marks is "+avg);
	}
}
