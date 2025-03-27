package learn.DSA.ArrayShradhaSheet.Medium;

public class RepeatAndMissingNumbers {

    public static void main(String[] args) {

//        Input: arr[] = {3, 1, 3}
//        Output: 3, 2
//        Explanation: In the array, 2 is missing and 3 occurs twice.
//
//
//        Input: arr[] = {4, 3, 6, 2, 1, 1}
//        Output: 1, 5
//        Explanation: 5 is missing and 1 is repeating.



    }

    public int[] repeatedNumber(final int[] arr) {

        int n = arr.length;

        // Creating frequency array of size n+1 with
        // initial values as 0. Note that array
        // values will go upto n, that is why we
        // have taken the size as n+1
        int[] freq = new int[n + 1];   // [0,   1,0,2]
        //int repeating = -1;                   1 2 3
       // int missing = -1;
        int[] res= new int[2];

        // Find the frequency of all elements.
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {

            // For missing element, frequency
            // will be 0.
            if (freq[i] == 0) {
                res[1] = i;
            }

            // For repeating element, frequency
            // will be 2.
            else if (freq[i] == 2) {
                res[0] = i;
            }
        }

        return res;
    }

}
