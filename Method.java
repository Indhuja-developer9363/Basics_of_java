import java.util.*;
class Method{
//     static void greet(){
//         System.out.println("Hello,I am greet method");
//     }
//    public static void main(String[]args){
//     System.out.println("Before calling");
//     greet();
//     System.out.println("After calling");
//    }

// static void add(){
//     int a = 2;
//     int b = 3;
//     int c = a+b;
//     System.out.println(c);
// }
// public static void main(String[]args){
//     add();
// }

// public static String greet(){
//     String greet = "heloo";
//     return greet;
// }
// public static void main(String[]args){
//     System.out.println("hii");
//     System.out.println(greet());
//     System.out.println("bye");
// }

static void name (String username){
    System.out.println("This is "+username);
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    name(n);
}
}