package learn.DSA.TwoPointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
//        Input: height = [1,8,6,2,5,4,8,3,7]
//        Output: 49
//        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
//        In this case, the max area of water (blue section) the container can contain is 49.

        int[] arr= {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));


    }


        public static int maxArea(int[] h) {

            int left=0;
            int right= h.length-1;
            int max=0;
            while(left<right){
                max = Math.max(max, (right - left) * Math.min(h[left], h[right]));
                if(h[left] < h[right]){
                    left++;
                } else {
                    right--;
                }
            }

            return max;

        }

}
