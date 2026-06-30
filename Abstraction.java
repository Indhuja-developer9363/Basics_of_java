import java.util.*;

abstract class vehical{
    abstract void start();
}
public class Abstraction extends vehical{
    void start(){
        System.out.println("the car starts");
    }
    public static void main(String[]args){
        Abstraction c = new Abstraction();
        c.start();
    }
}