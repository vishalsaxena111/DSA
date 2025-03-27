package learn.DSA.ArrayShradhaSheet.Easy;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
//        Input: arr[] = {1, 4, 3, 2, 6, 5}
//        Output: {5, 6, 2, 3, 4, 1}
//        Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
//
//
//        Input: arr[] = {4, 5, 1, 2}
//        Output: {2, 1, 5, 4}
//        Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

        int[] arr = new int[]{1, 4, 3, 2, 6, 5};

        int[] res1 = reverseUsingTemp(arr);

        int[] res2 = reverseUsingTwoPointer(arr);

        int[] res3 = reverseUsingSwappingElements(arr);

        for(int r : res3)
            System.out.print(r+",");

   }

   // Using temp arr   O(n) / O(n)

    public static int[] reverseUsingTemp(int[] arr){

        int[] temp = new int[arr.length];
        for (int i=0; i< arr.length;  i++)
            temp[i] = arr[arr.length-1 - i];

        return temp;
    }

    // Two Pointer Approach  O(n) / O(1)

    public static int[] reverseUsingTwoPointer(int[] arr){

        int left=0, right= arr.length-1;

        while(left< right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            right--;

            left++;

        }

        return arr;
    }


    // using swapping elements O(n) / O(1)

    public static int[] reverseUsingSwappingElements(int[] arr){

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        return arr;
    }





}
