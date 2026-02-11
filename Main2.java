import java.util.*;
interface MathUtility{
    static void Even(int n){
        if(n%2==0){
            System.out.println("even");

        }
    }
    static void Odd(int n){
        if(n%2!=0){
            System.out.println("odd");}
}
        }
    
public class Main2 implements MathUtility{
    public static void main(String[] args) {
        MathUtility.Even(4);
        MathUtility.Odd(5);
    }
}
