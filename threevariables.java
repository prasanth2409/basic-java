import java.util.Scanner;
public class threevariables
{
public static void main(String[]args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the value of a:");
	int a=scanner.nextInt();
	System.out.println("enter the value of b:");
	int b=scanner.nextInt();
	System.out.println("enter the value of c:");
	int c=scanner.nextInt();
	int number1=(a>b)?a:b;
	int number2=(a>c)?a:c;
	int number=(number1>number2)?number1:number2;
	System.out.println("The largest number is"+number);
}
}	