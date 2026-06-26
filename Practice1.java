//Homework programs in ArrayList

import java.util.ArrayList;

public class Practice1{
    public static void main(String[]args){
        // ArrayList <String> names = new ArrayList<>();

        // names.add("Indhu");
        // names.add("Dhatchu");
        // names.add("Praveen");
        // names.add("Boo");

        // System.out.println(names);
        // System.out.println(names.size());
        // System.out.println(names.remove(2));
        // System.out.println(names.get(1));

        ArrayList <Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);

        System.out.println(list);
        System.out.println(list.contains(103));
        System.out.println(list.size());
    }
}