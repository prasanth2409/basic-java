import java.util.Scanner;

public class increment {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=scn.nextInt();
        int b=++a;
        System.out.println(b);
        System.out.println(++b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

    }
}

