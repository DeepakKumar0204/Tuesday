package Revison;

public class sli2 extends sli1 {
	int fees;
	public sli2(int rollno,String name,int fees) 
	{
		super(rollno,name);
		this.fees=fees;
	}
	void display2() {
		System.out.println("The fees is "+fees);
	}
	public static void main(String[] args) {
		sli2 s=new sli2(2,"Dharani",30000);
		s.display();
		s.display2();
		
	}

}
