 class Student{
        String name;
        int age;
    
    Student(){
        name = "Indhu";
        age = 19;
}
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[]args){
        Student s1 = new Student();
        s1.display();
    }
}