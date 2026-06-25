import java.util.*;

public class Eletricbill{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int total = 0;
        if( unit<100){
            total = unit - 100;
            System.out.println(total);
        }
            // else if(total>=100 && total<=200){
            //     units = total*2;
            //     System.out.println(units);
            // }
    }
}