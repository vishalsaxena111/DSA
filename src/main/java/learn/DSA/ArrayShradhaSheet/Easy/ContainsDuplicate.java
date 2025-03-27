package learn.DSA.ArrayShradhaSheet.Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
//        Example 1:
//
//        Input: nums = [1,2,3,1]
//
//        Output: true
//
//        Explanation:
//
//        The element 1 occurs at the indices 0 and 3.
//
//        Example 2:
//
//        Input: nums = [1,2,3,4]
//
//        Output: false
//
//        Explanation:
//
//        All elements are distinct.

      int[] arr = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(arr));


    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i< nums.length; i++) {
            if(!set.add(nums[i]))
                return true;
        }

        return false;
    }
}
