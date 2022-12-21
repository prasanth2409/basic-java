import java.util.Scanner;
class prime 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the num:");
		int n=scn.nextInt();
		if(n<=1)
		{
			System.out.println(n+"IS NOT A PRIME NUMBER");
			return;
		}
		for (int i=2;i<=n/2 ;i++)
			{
				if(n%i==0)
					{
					System.out.println(n+"IS NOT A PRIME NUMBER");
					return;
					}								
			}
			System.out.println(n+"IS PRIME NUMBER");			
	}
}
