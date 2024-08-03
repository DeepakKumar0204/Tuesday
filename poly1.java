package Revison;

public class poly1 {
	int sum(int x,int y) {
		return x+y;
	}
	int sum(int x,int y,int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
           poly1 p=new poly1();
          System.out.println(p.sum(3, 4));
          System.out.println(p.sum(3, 4,8));
	}
}
