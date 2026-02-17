import java.util.*;
public class Calculation{
    int a;
    int b;
void sum(){
    System.out.println("the sum is "+(a+b));
}
void multiply(){
    System.out.println("the multiplication is "+(a*b));
}   
    public static void main(String[] args) {
        Calculation m1=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        m1.a=sc.nextInt();
        System.out.println("enter the value of b");
        m1.b=sc.nextInt();
        m1.sum();
        m1.multiply();
    }
}