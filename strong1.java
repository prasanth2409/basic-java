import java.util.Scanner;
class strong1
{
  public static void main (String[]args)
  {
	Scanner scn = new Scanner(System.in);
    System.out.println("ENTER THE NUM:");
	int num =scn.nextInt();
    if (strong(num))
        System.out.println (num + " is Strong Number");
    else
        System.out.println (num + " is not a Strong Number");
  }
  static int facto (int num)
  {
     if(num == 0)
        return 1;
        
    return num * facto(num-1);
  }
  static boolean strong(int num)
  {
     int digit, sum = 0;
    int temp = num; 
    while(temp!=0)
	{
        digit = temp % 10;
        
        sum = sum + facto(digit);
        temp /= 10;
    }
    return sum == num;

  }
}