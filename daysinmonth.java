import java.util.Scanner;
class daysinmonth
{
public static void main(String[]args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the month:");
	int a=scanner.nextInt();
	
	System.out.println("enter the year:");
	int b=scanner.nextInt();
	switch(a){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: System.out.println("31 days");
			break;
	case 4:
	
	case 6:
	case 9:
	case 11: System.out.println("30 days");
			break;
	case 2: if( b%400 ==0) //(b%4==0 && b%100!=0)
			{
			System.out.println("29 days");
			}
			else{
			System.out.println("28 days");
			break;
			}
	default : System.out.println("invalid month");
	}

}
}	