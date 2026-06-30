import java.util.*;

abstract class atm{
    void display(){
        System.out.println("HIIIEEEE..");
    }
}
class bank extends atm{

}
class app extends atm{

}
public class Example1a{
    public static void main(String[]args){
        bank b = new bank();
        app a = new app();
        b.display();
        a.display();
    }
} 