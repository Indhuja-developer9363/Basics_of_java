import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int sum = 0;

        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println(sum);
    }
}