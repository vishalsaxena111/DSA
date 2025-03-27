package learn.DSA.ArrayShradhaSheet.Easy;

public class MaximumAndMinimumInArray {

//    Input: arr[] = {3, 5, 4, 1, 9}
//    Output: Minimum element is: 1
//    Maximum element is: 9
//
//
//    Input: arr[] = {22, 14, 8, 17, 35, 3}
//    Output:  Minimum element is: 3
//    Maximum element is: 35

    public static void main(String[] args) {

        int [] arr = new int[]{3, 5, 4, 1, 9};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
    }

    public static int findMax(int[] arr){

        int max=arr[0];
        for (int i=1; i<arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }

        return max;

    }

    public static int findMin(int[] arr){

        int min=arr[0];
        for (int i=1; i<arr.length; i++){
            if(min > arr[i])
                min = arr[i];
        }

        return min;
    }

}
