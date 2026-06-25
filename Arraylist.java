import java.util.ArrayList;

public class Arraylist{
    public static void main(String[]args){

        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(42);
        nums.add(34);
        nums.add(35);
        nums.add(88);
        for(int list:nums)
            if(list%2==0){
                System.out.println(list);  //[42,34,88]
            }
        System.out.println(nums);  //[42,34,35,88]
        System.out.println(nums.size()); //4
        System.out.println(nums.remove(1));  //34
        System.out.println(nums.contains(3));  //False - checking the values are there or not

    }
}