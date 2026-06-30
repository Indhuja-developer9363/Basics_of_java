import java.util.*;

class calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
}
public class Polymorphism{
    public static void main(String[]args){
        calculator s = new calculator();
        System.out.println(s.add(1,2));
        System.out.println(s.add(1,2,3));
    }
}