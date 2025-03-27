package learn.DSA.TwoPointer;

public class TwoSum2 {

    public static void main(String[] args) {
       // Example 1:

       /* Input: numbers = [2,7,11,15], target = 9
        Output: [1,2]
        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
        Example 2:

        Input: numbers = [2,3,4], target = 6
        Output: [1,3]
        Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
        Example 3:

        Input: numbers = [-1,0], target = -1
        Output: [1,2]
        Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].*/

        int[] arr= {2,7,11,15};
        for (int a : twoSum(arr,9))
            System.out.printf(" %d",a);
    }

    public static int[] twoSum(int[] n, int t) {

        if(n.length<3 && n[0]+ n[1]==t)
            return new int[]{1, 2};

        int left= 0;
        int right=n.length-1;

        while(left<right){
            if(n[left]+ n[right]==t)
                return new int[]{left+1, right+1};

            if(n[left]+ n[right] < t)
                left++;
            if(n[left]+ n[right] > t)
                right--;
        }
        return new int[2];
    }

}



