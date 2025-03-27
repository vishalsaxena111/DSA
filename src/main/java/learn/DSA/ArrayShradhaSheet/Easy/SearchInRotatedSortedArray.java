package learn.DSA.ArrayShradhaSheet.Easy;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
//        Example 1:
//
//        Input: nums = [4,5,6,7,0,1,2], target = 0
//        Output: 4
//        Example 2:
//
//        Input: nums = [4,5,6,7,0,1,2], target = 3
//        Output: -1

        // https://www.youtube.com/watch?v=6WNZQBHWQJs

        int[] arr = new int[]{4,5,6,7,0,1,2};

        System.out.println(usingBinarySearch(arr, 7));

    }

    public static int usingBinarySearch(int[] arr, int t){

        int start = 0; int end= arr.length-1;



        while(start<= end){

            int mid = start + (end - start)/2;

            if(arr[mid]==t)
                return mid;

            if(arr[start] <= arr[mid]){

                if(arr[start] <= t && t <= arr[mid] )
                    end = mid -1;
                else
                    start = mid+1;

            }else{

                if(arr[mid] <= t && t <= arr[end])
                    start = mid+1;
                else
                    end =  mid-1;

            }

        }

        return -1;

    }

}
