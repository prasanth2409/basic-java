package model;
import java.util.Scanner;

public class model 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Hi, Welcome to my software...!");
		System.out.println("Pearl from pebble");
		System.out.println("Menu Executed: ");
		
		for(;;)
		{
			System.out.println("1. Factorial\n"
					+ "2. Length of a Number\n"
					+ "3. Power of a Number\n"
					+ "4. Check ArmStrong Number\n"
					+ "5. Check Strong Number\n"
					+ "6. Range of ArmStrong Numbers\n"
					+ "7. Range of Strong Numbers");
			
			Scanner sca = new Scanner(System.in);
			System.out.println("Enter your Choice: ");
			int choice = sca.nextInt();
			
			if(choice==1)
			{
				System.out.println("Factorial of a Number Program");
				System.out.println("Enter a number: ");
				int num = sca.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					System.out.println(num + " != " + main1.factorial(num));
				}

			}
			else if(choice == 2)
			{
				System.out.println("Length of a Number: ");
				System.out.println("Enter the number: ");
				int num = sca.nextInt();
				
				if(num<0) System.out.println("No Negaives");
				else
				{
					System.out.println(num + " length is " + main1.length(num));
				}
			}
			else if(choice == 3)
			{
				System.out.println("Power of a Number: ");
				System.out.println("Enter the Base: ");
				int base = sca.nextInt();
				
				System.out.println("Enter the Exponent: ");
				int exp = sca.nextInt();
				if(base<0) System.out.println("No Negatives");
				else
				{
					System.out.println("The Power is : " + main1.power(base, exp));
				}
			}
			else if(choice == 4)
			{
				System.out.println("Armstong Number program: ");
				
				System.out.println("Enter the Number: ");
				int num = sca.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					int res = main1.armStrong(num);
					if(num==res) System.out.println("It is ArmStrong");
					else System.out.println("It is not ArmStrong");
				}
			}
			else if(choice == 5)
			{
				System.out.println("Strong number program: ");
				
				System.out.println("Enter the Number: ");
				int num = sca.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					int res = main1.strong(num);
					if(num==res) System.out.println("It is Strong");
					else System.out.println("It is not Strong");
				}
			}
			else if(choice == 6)
			{
				System.out.println("Range of Armstrong Numbers");
				
				System.out.println("Enter the Range: ");
				int range = sca.nextInt();
				for(int i=1;i<=range;i++)
				{
					if(i== main1.armStrong(i))
						System.out.println(i);
				}
			}
			else if(choice == 7)
			{
				System.out.println("Range of Strong Numbers: ");
				
				System.out.println("Enter the Range: ");
				int range = sca.nextInt();
				for(int i=1;i<=range;i++)
				{
					if(i== main1.strong(i))
						System.out.println(i);
				}
			}
			else
			{
				System.out.println("Sorry User, Its a invalid Choice...!");
			}
			
			System.out.println("Do you want to continue? y/n");
			char ch = sca.next().charAt(0);
			if(ch=='y') continue;
			else
			{
				System.out.println("Thank you for using my software");
				System.out.println("Try again next time");
				System.out.println("Happy Day");
				break;
			}
		}
		
	}

}

