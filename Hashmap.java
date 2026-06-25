import java.util.HashMap;

public class Hashmap{
    public static void main(String[]args){

        HashMap<Integer,String> students = new HashMap<>();

        students.put(1,"Indhu");
        students.put(2,"Praveen");
        students.put(3,"Dhatchu");
        students.put(4,"Boo");

        System.out.println(students);
        System.out.println(students.containsKey(1));         //key - integer  - true
        System.out.println(students.containsValue("Boo"));   //value - string  - true
        System.out.println(students.get(3));                 //Dhatchu
        System.out.println(students.remove(3));              //Dhatchu
        System.out.println(students.size());                 //3
    }
}