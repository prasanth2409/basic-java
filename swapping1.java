import java.util.Scanner;
public class swapping1
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a =scanner.nextInt();
		System.out.println("Enter the second number:");
		int b =scanner.nextInt();
		int c=b;
		b=a;
		a=c;
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
	}
}