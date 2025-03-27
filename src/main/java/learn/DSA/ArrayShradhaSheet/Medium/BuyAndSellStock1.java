package learn.DSA.ArrayShradhaSheet.Medium;

public class BuyAndSellStock1 {

    public static void main(String[] args) {
//        Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {

        int minSofor= arr[0];
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++){
            minSofor = Math.min(minSofor, arr[i]);
            int profit = arr[i]-minSofor ;
            maxProfit = Math.max(maxProfit,profit);

        }
        return maxProfit;
    }
}
