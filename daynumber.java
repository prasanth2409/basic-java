import java.util.Scanner;
class daynumber
{
public static void main(String[]args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the no of the day:");
	int a=scanner.nextInt();
	switch(a){
	case 1: System.out.println("sunday");
			break;
	case 2: System.out.println("monday");
			break;
	case 3: System.out.println("tuesday");
			break;
	case 4: System.out.println("wednesday");
			break;
	case 5: System.out.println("thursday");
			break;
	case 6: System.out.println("friday");
			break;
	case 7: System.out.println("saturday");
			break;
	default : System.out.println("invalid number");


	}
	
}
}	