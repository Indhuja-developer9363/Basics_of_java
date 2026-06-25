import java.util.*;

public class Gradecal{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        if( mark>=90 && mark<=100){
            System.out.println("A grade");
        }
        else if( mark>=80 && mark<90){
            System.out.println("B grade");
        }
        else if( mark>=60 && mark<80){
            System.out.println("C grade");
        }
        else if( mark>=50 && mark<60){
            System.out.println("D grade");
        }
        else if( mark>=35 && mark<50){
            System.out.println("E grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}