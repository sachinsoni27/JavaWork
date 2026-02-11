interface Addition{
     void add(int a,int b);
    
    
    static void addNumbers(int a,int b){
        System.out.println(a+b);
    }
}

public class Main3 implements Addition{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Main3 d= new Main3();
        d.add(50, 20);
        Addition.addNumbers(80, 20);
        
    }
}
