import java.util.*;

// abstract class vehical{
//     abstract void start();
// }
// public class Abstraction extends vehical{
//     void start(){
//         System.out.println("the car starts");
//     }
//     public static void main(String[]args){
//         Abstraction c = new Abstraction();
//         c.start();
//     }
// }

// Abstraction vs encapsulation

// encapsulation

// hides data
// uses private variables
// protects data
// uses getter and setters

// Abstraction

// hides implementation
// uses abstract classes/interface

abstract class Shape{
    abstract void area();
}
class circle extends Shape{
    void area(){
        c = 3.14
    }
}
