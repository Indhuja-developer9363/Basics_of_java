import java.util.*;

public class Posneg{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if(a>0){
            System.out.println("Positive number");
        }
        else if(a==0){
            System.out.println("Null");
        }
        else{
            System.out.println("Negative number");
        }
    }
}