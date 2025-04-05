package Strivers.Basic.Recursion;

public class BasicRecursionExamples {
    public static void main(String[] args) {

        fib(6);
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


    // fibbnocci series
    public static void fib(int n){

        System.out.print("0 1 ");
        helperfib(1, n, 0, 1);

    }

    public static void helperfib(int i, int n, int pre, int curr){

        if(i>n)
            return;

        System.out.print((pre +  curr)+ " ");

        helperfib(i+1, n, curr, (pre+curr));

    }
}
