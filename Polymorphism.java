// import java.util.*;

// class calculator{
//     int add(int a,int b){
//         return a+b;
//     }
//     int add(int a,int b, int c){
//         return a+b+c;
//     }
// }
// public class Polymorphism{
//     public static void main(String[]args){
//         calculator s = new calculator();
//         System.out.println(s.add(1,2));
//         System.out.println(s.add(1,2,3));
//     }
// }

//BOTH OVERLOADING AND OVERRIDDING

class vehical{
    void start(){
        System.out.println("Vehical started");
    }
}
class car extends vehical{
    @Override
    void start(){
        System.out.println("Car Starts");
    }
    void start(String mode){
        System.out.println("Car is started in "+mode);
    }
}
class bike extends vehical{
    @Override
    void start(){
        System.out.println("Bike starts");
    }
    void start(String mode){
        System.out.println("Bike is started in "+mode);
    }
}
public class Polymorphism{
    public static void main(String[]args){
        vehical v;
        v = new car();
        v.start();

        car c = new car();
        c.start("Sports");

        v = new bike();
        v.start();

        bike b = new bike();
        b.start("Eco");

    }
}