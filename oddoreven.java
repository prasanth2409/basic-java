import java.util.Scanner;
public class oddoreven{
	public static void main (String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the numbr");
		int a = scn.nextInt();
		if(a%2==0){
		System.out.println("The number is even");
		}
		else
		{
		System.out.println("The number is odd");
		}
	}
}