// class Box<T>{
//     T value;
// }
// public class Genrics{
//     public static void main(String[]args){
//         Box<String>b=new Box<>();
//         b.value = "Java";
//         System.out.println(b.value);
//         Box<Double>d=new Box<>();
//         d.value = 23.9;
//         System.out.println(d.value);
//     }
// }
//we can stores the values in different datatypes

//GENERIC CLASS WITH METHOD

// class Box<T>{
//     T value;

//     void setValue(T value){
//         this.value=value;
//     }
//     T getValue(){
//         return value;
//     }
// }
// public class Genrics{
//     public static void main(String[]args){
//         Box<String>b=new Box<>();
//         b.setValue("Welcome");
//         System.out.println(b.getValue());
//     }
// }

class Student<T,U>{
    T id;
    U name;

    Student(T id,U name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class Genrics{
    public static void main(String[]args){
        Box<Integer,String>b=new Box<>();
    }
}