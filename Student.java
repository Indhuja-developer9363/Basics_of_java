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

// class Student{
//     Student(){
//         System.out.println("Default constructor");
//     }
//     Student(String name){
//         System.out.println("Name : "+name);
//     }
//     Student(String name,int age){
//         System.out.println("Name : "+name + " , age : "+age);
//     }
//     public static void main(String[]args){
//         new Student();
//         new Student("Indhu");
//         new Student("Pravee",20);
//     }
// }

//EXAMPLE - WORKOUT

// class Student{
//         String name;
//         int age;
//         double CGPA;

//     Student(String n,int a,double c){
//         name = n;
//         age = a;
//         CGPA = c;
//     }
//     Student(Student s){
//         name = s.name;
//         age = s.age;
//         CGPA = s.CGPA;
//     }
//     void display(){
//         System.out.println("Name : " + name);
//         System.out.println("Age : " + age);
//         System.out.println("CGPA : " + CGPA);
//     }
//     public static void main(String[]args){
//         Student s1 = new Student("Indhu",19,7.25);
//         Student s2 = new Student(s1);
//         s2.display();
//     }
// }

// class Student{
//     String employee;
//     int salary;

//     Student(){
//         employee = "Dhatchanamoorthi";
//         salary = 1200000;
//     }
//     void display(){
//         System.out.println("Employee name : "+employee);
//         System.out.println("Salary : "+salary);
//     }
//     public static void main(String[]args){
//         Student s1 = new Student();
//         s1.display();
//     }
// }

// class Student {
//     String name;
//     int rollNo;
//     static String collegeName = "ABC college";

//     Student(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     void display() {
//         System.out.println("Name        : " + name);
//         System.out.println("Roll No     : " + rollNo);
//         System.out.println("College Name: " + collegeName);
//     }

//     public static void main(String[] args) {

//         Student s1 = new Student("Indhu", 101);
//         Student s2 = new Student("Kavi", 102);

//         s1.display();
//         System.out.println();

//         s2.display();
//     }
// }

