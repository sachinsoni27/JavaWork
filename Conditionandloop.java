/*import java.util.*;
public class Conditionandloop {
    public static void main (String[]args){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println(i);
        }
    }
}
//WHILE LOOP 

  import java.util.*;
  public class Conditionandloop {
public static void main( String[]args ){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num =1;
    while(num<=n){
        System.out.println(num);
        num++;
    }

  }
} 
   NOTE -  for loop is used when we know how many time run the functon
   while loop is used when we dont know how many time run the function




   DO - WHILE LOPP
   
 import java.util.*;

public class Conditionandloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        do {
            System.out.println(n);
            n++;
        } while (n <= 10);
    }
}

import java.util.*;
public class Conditionandloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int  c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
import java.util.*;
public class Conditionandloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max= Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}  
//FIBONACCI SERIES
// FIBONACCI SERIES USING WHILE LOOP
import java.util.*;

public class Conditionandloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;
        int count = 1;

        while (count <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
    }
}

//COUNTING OCCCURENCE OF DIGITS IN A NUMBER(3 IN 13839)
import java.util.*;
p/ ublic class  Conditionandloop{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            int rem = n%10;
            if(rem==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }

}
//REVERSE OD THE NUMBER  23597
import java.util.*;
public class Conditionandloop {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rev =0;
    while(n>0){
        int rem = n%10;
        rev = rev*10 + rem;
        n=n/10;
    }
    System.out.print(rev);

}
}*/