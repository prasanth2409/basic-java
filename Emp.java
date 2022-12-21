package demo;
import java.util.Scanner;

public class Emp{
	int eId,eAge;
	String eName,eGender,eAddress,eJoinDate;
	static String companyName,eBranch;
	
	public void addEmployee() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter branch :");
		eBranch=scn.nextLine(); 
		
		System.out.print("Enter ID :");
		eId=scn.nextInt(); scn.nextLine();
		
		System.out.print("Enter Name :");
		eName=scn.nextLine(); //scn.nextLine();
		
		System.out.print("Enter Age :");
		eAge=scn.nextInt();  scn.nextLine();
		
		System.out.print("Enter Gender :");
		eGender=scn.nextLine();
		
		System.out.print("Enter Address :");
		eAddress=scn.nextLine();
		
		System.out.println(".............................................");
		
		
	}
	public void display() {
		System.out.println("COMPANY NAME :"+companyName);
		System.out.println("BRANCH :"+eBranch);
		System.out.println("EMPLOYEE ID :"+eId);
		System.out.println("NAME :"+eName);
		System.out.println("AGE :"+eAge);
		System.out.println("GENDER :"+eGender);
		System.out.println("ADDRESS :"+eAddress);
		System.out.println(".............................................");
		
	}
	public static void changeCompany() {
		System.out.println("enter company name :");
		Scanner scn=new Scanner(System.in);
		companyName=scn.nextLine();
	//	scn.next();
	}
	public void changeBranch() {
		System.out.println("enter other branch :");
		Scanner scn=new Scanner(System.in);
		eBranch=scn.nextLine();
	}
}
class EmpInfo {
	
	public static void main(String[] args) {
		Emp.companyName="Wipro";
		Emp.eBranch="Abc";
		Emp e1 = new Emp();
		e1.addEmployee();
		e1.display();
		Emp e2 = new Emp();
		e2.addEmployee();
		e2.display();
		Emp.changeCompany();
		e1.changeBranch();
		e1.display();
		e2.changeBranch();
		e2.display();
		
	}

}