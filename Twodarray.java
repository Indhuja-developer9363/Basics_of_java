import java.util.*;
public class Twodarray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // int m = 2;
        // int n = 2;

        // int x=2;
        // int y=1;

        // int arr[][]={
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // System.out.println(arr[m][n]);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int arr [][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println(arr[x][y]);
        }
    }
}