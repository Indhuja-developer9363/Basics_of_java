import java.util.*;

public class Larnumarray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int [n];

        int max = 0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest number : "+max);
    }
}

//output :
// 3
// 12
// 55
// 54
// Largest number : 55