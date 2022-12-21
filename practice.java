package demo;
import java.util.*;


public class practice {
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        int num =scn.nextInt();
        System.out.println("enter the number:");
        int b;
        for(b=1; b<=10; b++)
        {
        	System.out.println(num +" x "+ b +" = "+ num*b);
        }
    }
}
