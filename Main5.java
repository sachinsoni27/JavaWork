import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("all no.:");
        list.forEach(n -> System.out.print(n + " "));
        System.out.println("\nEvn no.:");
        list.forEach(n -> {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            } 
        });
    }
}