package learn.DSA.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
//        Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//        Notice that the solution set must not contain duplicate triplets.
//
//        Example 1:
//
//        Input: nums = [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]
//        Explanation:
//        nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//        nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//        The distinct triplets are [-1,0,1] and [-1,-1,2].
//        Notice that the order of the output and the order of the triplets does not matter.

        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(threeSumOptimized(arr));
    }

    // brute force approach time limit exceed in leet code
        public static List<List<Integer>> threeSum(int[] a) {
            Arrays.sort(a);
            List<List<Integer>> list = new ArrayList<>();
            for( int i=0; i< a.length; i++){
                for(int j=i+1; j<a.length; j++){
                    for(int k=j+1 ; k< a.length; k++){
                        if((a[i]+ a[j]+ a[k]==0)){
                            List<Integer> innerList = new ArrayList<>();
                            innerList.add(a[i]);
                            innerList.add(a[j]);
                            innerList.add(a[k]);
                            System.out.println(innerList);
                            if(!list.contains(innerList))
                                list.add(innerList);
                        }


                    }
                }
            }


            return list;
        }



    public static List<List<Integer>> threeSumOptimized(int[] a) {
        Arrays.sort(a); // Sort the array to use the two-pointer technique
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < a.length - 2; i++) {
            // Skip duplicate elements for the first number
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            int left = i + 1; // Pointer to the next element
            int right = a.length - 1; // Pointer to the last element

            while (left < right) {
                int sum = a[i] + a[left] + a[right];

                if (sum == 0) {
                    // Found a triplet
                    list.add(Arrays.asList(a[i], a[left], a[right]));

                    // Skip duplicate elements for the second number
                    while (left < right && a[left] == a[left + 1]) {
                        left++;
                    }

                    // Skip duplicate elements for the third number
                    while (left < right && a[right] == a[right - 1]) {
                        right--;
                    }

                    // Move both pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    // If the sum is less than zero, move the left pointer to increase the sum
                    left++;
                } else {
                    // If the sum is greater than zero, move the right pointer to decrease the sum
                    right--;
                }
            }
        }

        return list;
    }


}
