public class assign {
    public static void main(String [] args){
        int a=10;
        int b=20;
        System.out.println("the value stored in a is "+a);
        System.out.println("the value stored in a is "+b);

        System.out.println("the assignment addition of a and b is "+(a+=b));
        System.out.println("the assignment subtraction of a and b is "+(a-=b));
        System.out.println("the assignment multiplication of a and b is "+(a*=b));
        System.out.println("the assignment division of a and b is "+(a/=b));
        System.out.println("the assignment modulus of a and b is "+(a%=b));
    }
}
