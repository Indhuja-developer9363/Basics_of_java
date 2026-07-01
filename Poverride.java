import java.util.*;

// class Animal{
//     void sound(){
//         System.out.println("Animal sound");
//     }
// }
// class Dog extends Animal{
//     @Override
//     void sound(){
//         System.out.println("Bark");
//     }
// }
// public class Poverride{
//     public static void main(String[]args){
//         Animal d = new Dog();
//         d.sound();
//     }
// }

class employee{
    void work(){
        System.out.println("Employee");
    }
}
    class developer extends employee{
        @Override
        void work(){
            System.out.println("Writing code");
        }
    }
    class manager extends employee{
        @Override
        void work(){
            System.out.println("Managing team");
        }
    }

public class Poverride{
    public static void main(String[]args){
        employee e ;
        e = new developer();
        e.work();
        e = new manager();
        e.work();
    }
}