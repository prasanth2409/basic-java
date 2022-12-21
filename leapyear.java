import java.util.Scanner;
public class leapyear
{
public static void main(String[]args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the year:");
	int a=scanner.nextInt();
	if((a%400==0)||(a%4==0 && a%100!=0))
	{
	System.out.println("The year is leap year");
	}
	else
	{
	System.out.println("The year is not leap year");
	} 
	
}
}	