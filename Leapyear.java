import java.util.*;

public class Leapyear{
    public static void main(String[]args){

        Scanner obj = new Scanner(System.in);
        int year = obj.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("This year is Leapyear");
        }
        else{
            System.out.println("Not a Leapyear");
        }
    }
}