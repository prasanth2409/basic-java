package demo;

class Student {
	int Sid;
	String Sname;
	int Age;
	String gender;
	String phno;
	static String collegeName;
	static String collegeAddress;

public void addStudents(int id,String name,int Sage,String gen,String phone) {
	Sid=id;
	Sname=name;
	Age=Sage;
	gender=gen;
	phno=phone;
	
}
public void displayStudentsDetails() {
	System.out.println(Sid);
	System.out.println(Sname);
	System.out.println(Age);
	System.out.println(gender);
	System.out.println(phno);
	System.out.println(collegeName);
	System.out.println(collegeAddress);
	System.out.println("******************************");
}
public static void changeCollegeAddress (String Address)
{
	collegeAddress=Address;
}
public static void changeCollegeName(String Name) 
{
	collegeName=Name;
}
public static void main(String[] args) 
	{
		Student.collegeName="JSP";
		Student.collegeAddress="OAR";
		Student s1=new Student();
		
		
		s1.addStudents(1,"gun", 22, "MALE", "9876543219");
		s1.displayStudentsDetails();
		
		Student s2=new Student();
		
		s2.addStudents(2, "bun", 21, "MALE", "1234567890");
		s2.displayStudentsDetails();
		
		Student.collegeAddress="MARATHALLI";
		
		s1.displayStudentsDetails();
		s2.displayStudentsDetails();
		
		
		Student.collegeName="JSPIDER";
		
				
		s1.displayStudentsDetails();
		s2.displayStudentsDetails();

	}

}
