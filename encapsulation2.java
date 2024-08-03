package Revison;

public class encapsulation2 extends encapsulation{
	int rollno;
	public encapsulation2(int id,int rollno) {
		super(id);
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		encapsulation2 e2=new encapsulation2(7,8);
		System.out.println(e2.getid());
		e2.setid(6);
		System.out.println(e2.getid());

		
	}

}
