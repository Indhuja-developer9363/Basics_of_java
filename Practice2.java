import java.util.HashSet;
public class Practice2{
    public static boolean containsDuplicate(int[]nums){
        HashSet <Integer> set = new HashSet <>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[]args){
        int [] nums = {1,2,3,4};
        boolean result = containsDuplicate(nums);
        System.out.println("Array : ");
        for(int num : nums){
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.println(result);
    }
}

// public class Practice2{
//     public static void main(String[]args){

//         HashSet <Integer> ids = new HashSet <>();
//         ids.add(23);
//         ids.add(12);
//         ids.add(26);
//         ids.add(67);
//         ids.add(12);  //duplicate will removed in hashset

//         System.out.println(ids);  //order will changes
//         System.out.println(ids.size());
//         System.out.println(ids.contains(26));
//     }
// }

