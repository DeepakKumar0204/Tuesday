package Revison;
import java.util.*;
public class constructor 
{
int rollno=7;
String name;
static int id=50;
	public constructor(int rollno,String name) 
	{
		this.rollno=rollno;
		this.name=name;
	
	}
	public constructor() //default constructor
	{
		System.out.println("This is default constructor");
	}
	void display() 
	{
		System.out.println("The roll no is"+rollno);
		System.out.println("The name is "+name);
		System.out.println("The id is "+id);

	}

public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the roll no");
	int rollno=s.nextInt();
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the id");
	int id=s.nextInt();
	constructor c1=new constructor(rollno,name);
	constructor c2=new constructor();
	constructor c3=new constructor(3,"Deepak");
	c1.display();
	c3.display();
	constructor.id=60;
	System.out.println(c1.rollno);
	System.out.println(c2.id);
	System.out.println(c3.id);
	System.out.println(c1.id);

//Static variable is common for all the objects.
	System.out.println(constructor.id);

}}