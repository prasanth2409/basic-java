import java.util.*;
class studentown 
{
	public void data()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter student name:");
		System.out.println("Enter student roll No:");
		System.out.println("Enter student age:");
		System.out.println("Enter student phone No:");
		System.out.println("Enter student gender:");
		String name = scn.nextLine();
		int rollNo = scn.nextInt();
		int age = scn.nextInt();
		String gender = scn.next();
		String phoneNo = scn.next();		
	}
	public static void college()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter college name:");
		System.out.println("Enter college add:");
		static String collegeName = scn.nextLine();
		static String collegeAdd = scn.nextLine();
	}
	public void showdata()
	{
		
		System.out.println("College name="+collegeName);
		System.out.println("College add="+collegeAdd);
		System.out.println("Student name="+ name);
		System.out.println("Student roll No="+rollNo);
		System.out.println("Student age="+age);
		System.out.println("Student gender="+gender);
		System.out.println("Student phone No="+phoneNo);
	}
	public static void main(String[]args)
	{
		studentown = new studentown();
		college = new college();
		studentown.showdata();
		college.showdata();
	}
}
