import java.util.Scanner;
class destobin{
	public static void main(String[]args){
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s1.nextInt();
	int bin=0;
	int i=1;
	while(n>0){
	int bit =n%2;
	bin =(bit*1)+bin;
	n /=2;
	i+=10;
	}
	System.out.println(bin);
	}
}