package demo;

public class employee 
{
		int eid;
		String ename;
		int Age;
		String gender;
		String phno;
		String eexp;
		static String companyName;
		static String companyAddress;

	public void Employee(int id,String name,int eage,String gen,String phone,String exp) {
		eid=id;
		ename=name;
		Age=eage;
		gender=gen;
		phno=phone;
		eexp=exp;
		
	}
	public void displayEmployeeDetails() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(Age);
		System.out.println(gender);
		System.out.println(phno);
		System.out.println(eexp);
		System.out.println(companyName);
		System.out.println(companyAddress);
		System.out.println("******************************");
	}
	public static void changeCompanyAddress (String Address)
	{
		companyAddress=Address;
	}
	public static void changeCompanyName(String Name) 
	{
		companyName=Name;
	}
	public static void main(String[] args) 
		{
			employee.companyName="abcb";
			employee.companyAddress="bengalure";
			
			employee e1=new employee();			
			e1.Employee(1,"gun", 25, "MALE", "9876543219","5");
			
			
			employee e2=new employee();			
			e2.Employee(2, "bun", 24, "female", "1234567890","4");
			
			
			
			employee e3=new employee();			
			e3.Employee(3, "abc", 23, "MALE", "9449494949","3");
			
			
			employee e4=new employee();			
			e4.Employee(4, "def", 22, "female", "9876547890","2");
			
			
			employee e5=new employee();			
			e5.Employee(5, "ghi", 21, "MALE", "6363636365","1");
			
			
			employee.companyAddress="Itpl Whitefild";			
			employee.companyName="xyzoo";			
					
			e1.displayEmployeeDetails();
			e2.displayEmployeeDetails();
			e3.displayEmployeeDetails();
			e4.displayEmployeeDetails();
			e5.displayEmployeeDetails();
		}

}


