import java.util.*;

interface Calculator{
    static void square(int n){
        System.out.println(n*n);}

        static void cube(int n){
            System.out.println(n*n*n);
        }
    
}
public class Main implements Calculator{
    public static void main(String[] args) {
        Calculator.square(5);
        Calculator.cube(3);
    }
}