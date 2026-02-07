
/*import java.util.*;
public class Kunalleacture8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1+num2);

    }
}*/
import java.util.*;

public class Kunalleacture8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                System.out.println(num1 + num2);
            } else {
                System.out.println("Please enter second number as integer");
            }
        } else {
            System.out.println("Please enter numbers only");
        }

        sc.close();
    }
}
