import java.util.Scanner;
class bintodes{
	public static void main(String[]args){
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the number");
	int bin=s1.nextInt();
	int des=0;
	int i=1;
	while(bin>0){
	{
		des+=(bin%10)*i;
		bin/=10;
		i+=2;
	}
	System.out.println(des);
	}
}
}