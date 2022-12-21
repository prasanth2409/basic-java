import java.util.Scanner;

public class Interest {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the principle amount");
        double p=scn.nextDouble();
        System.out.println("enter the time  duration");
        double t=scn.nextDouble();
        System.out.println("enter the ratio of interest");
        double r=scn.nextDouble();
        double money=p*t*r;
        double simpleinterest=money/100;
        System.out.println("simpleinterest is : "+simpleinterest);

    }
}
