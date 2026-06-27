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

class Student{
        String name;
        int age;
    
    Student(String n,int a){
        name = n;
        age = a;
}
Student(Student s){
    name = s.name;
    age = s.age;
}
    void display(){
        System.out.println(name + " " + age);
    }
    public static void main(String[]args){
        Student s1 = new Student("Indhu",19);
        Student s2 = new Student(s1);
        s2.display();
    }
}