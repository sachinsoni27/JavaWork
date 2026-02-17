import java.util.*;
public class Student {
    int  hindi;
    int english;
    int maths;
    void calculate(int hindi,int english,int maths){
        int total=hindi+english+maths;
        
        float per=(total/300.0f)*100;
        System.out.println("the percentage is "+per);
    }
    public static void main(String[] args) {
        Student s1=new Student();
       
        s1.calculate(80,90,85);
    }
}
