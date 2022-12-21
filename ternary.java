import java.util.Scanner;

public class ternary {
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter ur age to check");
        int age=scn.nextInt();
        String str=(age>=18)? "eligible to vote":"not eligible to vote";
        System.out.println(str);
        System.out.println("enter the first number");
        int num1=scn.nextInt();
        System.out.println("enter the second number");
        int num2=scn.nextInt();
        int number=(num1>num2)?num1:num2;
        System.out.println("the largest number is "+number);

    }
}
