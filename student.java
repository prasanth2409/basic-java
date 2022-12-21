package model;

class student
{
	int sid;
	String name;
	int age;
	
	public student(int id,String name,int age)
	{
		this.sid = id;
		this.name = name;
		this.age = age;		
	}
	public void Displaystudent()
	{
		System.out.println("Student Id: "+this.sid);
		System.out.println("Student Name:"+this.name);
		System.out.println("Student Age: "+this.age);
		System.out.println("**************************************");
	}


	public static void main(String []args)
	{
		student S1=new student(1,"jag",22);
		S1.Displaystudent();
		student S2= new student(2,"prabu",21);
		S2.Displaystudent();
		
	}
}

	

