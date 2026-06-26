import java.util.Arrays;

class Arr{
    static void twice(int[]arr2){
        int n = arr2.length;
        for(int i = 0 ; i < n ; i++){
            arr2[i] = 2 * arr2[i];
        }
    }
    public static void main (String[]args){
        int[] arr1 = {23,45,67,62,88};
        System.out.println("Before modifying : " + Arrays.toString(arr1));  // arr1 - prints only a location
        twice(arr1);
        System.out.println("After modifying : " + Arrays.toString(arr1));  // Arrays.toString(arr1) - prints output like [46, 90, 134, 124, 176]
    }
}