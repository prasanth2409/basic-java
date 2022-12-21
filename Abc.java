package model;

public class Abc 
{
	int id;
	String name;
	int age;
	Abc(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	Abc(int id,String name,student S)
	{
		this.id=id;
		this.name=name;
		this.age=S.age;
	}
	public void display()
	{
		System.out.println("Student Id:"+id);
		System.out.println("Student Name:"+name);
		System.out.println("Student Age:"+age);
		System.out.println("+++++++++++++++++++++++++");
	}
	public static void main(String[]args)
	{
		Abc M1=new Abc(1,"kishor",23);
		M1.display();
		Abc M2=new Abc(2,"ram",21);
		M2.display();
		Abc M3=new Abc(3,"abi",20);
		M3.display();
			
	}
}



