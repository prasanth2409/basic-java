import java.util.Scanner;

public class bitwise {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scn.nextInt();
        System.out.println("enter num2");
        int num2=scn.nextInt();
        System.out.println(num1 & num2);
        System.out.println(num1|num2);
        System.out.println(num1 ^ num2);


    }
}
