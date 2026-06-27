//CONSTRUCTOR

//  class Student{
//         String name;
//         int age;
    
//     Student(){
//         name = "Indhu";
//         age = 19;
// }
//     void display(){
//         System.out.println(name);
//         System.out.println(age);
//     }
//     public static void main(String[]args){
//         Student s1 = new Student();
//         s1.display();
//     }
// }

//COPY CONSTRUCTOR

// class Student student{
//         String name;
//         int age;
    
//     Student(String n,int a){
//         name = n;
//         age = a;
// }
// Student(Student s){
//     name = s.name;
//     age = s.age;
// }
//     void display(){
//         System.out.println(name + " " + age);
//     }
//     public static void main(String[]args){
//         Student s1 = new Student("Indhu",19);
//         Student s2 = new Student(s1);
//         s2.display();
//     }
// }

// CONSTRUCTOR OVERLOADING

class Student{
    Student(){
        System.out.println("Default constructor");
    }
    Student(String name){
        System.out.println("Name : "+name);
    }
    Student(String name,int age){
        System.out.println("Name : "+name + " , age : "+age);
    }
    public static void main(String[]args){
        new Student();
        new Student("Indhu");
        new Student("Pravee",20);
    }
}