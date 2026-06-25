import java.util.HashSet;

public class Hashset{
    public static void main(String[]args){

        HashSet<String> vegs=new HashSet<>();
        vegs.add("Carrot");
        vegs.add("Betroot");
        vegs.add("cucumber");
        vegs.add("Ladysfinger");
        vegs.add("Cabbage");
        vegs.add("Carrot");     // In hashset cannot add the duplicates

        System.out.println(vegs);
        System.out.println(vegs.remove("Cabbage"));   //True - it cannot remove value because the value are not in
         //the given order it will mess . it cannot contains index value . index value va irundha remove aagum
        System.out.println(vegs.size());  //4
        System.out.println(vegs.contains("Betroot"));  //True
    }
}