import java.util.Scanner;
class fibonacii 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER THE NUM:");
		int a = scn.nextInt();
		System.out.println(fib(a));		
	}
	static int fib(int n)
	{
		if(n==1)return 0;
		if(n==2)return 1;
		return fib(n-1)+fib(n-2);
	}	
}
