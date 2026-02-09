/*import java.util.*;
public class day3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i <= n){
            System.out.print(" * ");
            i++;
        }
    }
}*/
import java.util.*;
public  class day3{
    public static void main( String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int i =1;
        while(i<=n){
            for(int j; j<=n; j++){
            System.out.print("*");
            j++;}

        }
        while(int i<=m){
            for(int k = 1 ; k <= m; k++){
            System.out.println("*");
            k++;
        }
        i++;

      

    }
}
