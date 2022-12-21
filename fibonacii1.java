import java.util.Scanner;
class fibonacii1
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER THE NUM:");
		int n =scn.nextInt();
		int a=0,b=1;
		while(a<=n)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
