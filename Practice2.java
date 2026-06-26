import java.util.HashSet;

public class Practice2{
    public static void main(String[]args){

        HashSet <Integer> ids = new HashSet <>();
        ids.add(23);
        ids.add(12);
        ids.add(26);
        ids.add(67);
        ids.add(12);  //duplicate will removed in hashset

        System.out.println(ids);  //order will changes
        System.out.println(ids.size());
        System.out.println(ids.contains(26));
    }
}