package Strivers.Basic.Recursion;

public class BasicRecursionExamples {
    public static void main(String[] args) {

        System.out.println( sumOfN(6));
    }

    // sum of n numbers
    public static int sumOfN(int n){

       return helper(1, n, 0);
    }

    public static int helper(int i, int n, int sum){

        if(i>n)
            return sum;

        sum = sum + i;

        return helper(i+1, n, sum);

    }
}
