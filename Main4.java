interface Greeting {

    default void sayHello() {
        System.out.println("Hello");
        printMessage(" print sayHello:");
    }

    default void sayGoodbye() {
        System.out.println("Goodbye");
        printMessage(" print sayGoodbye:");
    }

    private void printMessage(String msg) {
        System.out.println(msg);
    }
}


class Sun implements Greeting {
    
}

public class Main4 {
    public static void main(String[] args) {

        Sun obj = new Sun();

        obj.sayHello();
        obj.sayGoodbye();
    }
}