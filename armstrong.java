import java.util.Scanner;
class armstrong 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the num:");
		int n = scn.nextInt();
		int arm=0,rem,c;
		c=n;
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm)
		{
			System.out.print("IS ARMSTRONG NUMBER");
		}
		else
		{
			System.out.print("NOT A ARMSTRON NUMBER");
		}
	}
}
