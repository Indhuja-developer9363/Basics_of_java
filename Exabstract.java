import java.util.*;

abstract class animal{
    abstract void end();
}

class cat extends animal{
    void end(){
    System.out.println("Meow Meow");
    }
}
class dog extends animal{
        void end(){
            System.out.println("dog barks");
        }
    }
    public class Exabstract{
    public static void main(String[]args){
    animal e = new cat();
    animal d = new dog();
    e.end();
    d.end();
    }
}