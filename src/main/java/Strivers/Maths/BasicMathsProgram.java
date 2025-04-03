package Strivers.Maths;

import java.util.ArrayList;

public class BasicMathsProgram {
    public static void main(String[] args) {

        System.out.println(reverseInteger(1534236469)); // reverse int

        System.out.println(isPalindrome(4554)); // palindrome

        System.out.println(findGcdOptimal(9,12)); // gcd

        System.out.println(isArmStrong(371));//armstrong

        int[] size= new int[1];
        int [] divisor = findDivisor(12,size);
        for(int i=0; i< size[0] ; i++)
             System.out.print(" "+divisor[i]);

        System.out.println();

        System.out.println(findDivisorsOptimal(12));

        System.out.println(isPrime(1483)); //prime

    }

    // reverse with over flow and negative values
    public static int reverseInteger(int n){
        int res=0;
        while(n!=0){
            int rem = n % 10;

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow case
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Underflow case
            }

            res = res*10 + rem;
            n = n/10;
        }


        return res;
    }

    // reverse normal
    public static int reverse(int n) {
        int res = 0;
        while (n > 0) {
            int rem = n % 10;
            res = res * 10 + rem;
            n = n / 10;
        }
        return res;
    }

    public static boolean isPalindrome(int x){

        int rev = reverse(x);
        return x == rev;

    }

    // brute force
    public static int findGcd(int n1, int n2){

        int gcd= 1;

        for(int i=1; i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0)
                gcd=i;
        }
        return gcd;
    }

    //better gdc
    public static int findGcdBetter(int n1, int n2){

        int gcd= 1;

        for(int i=Math.min(n1,n2); i>0;i--){
            if(n1%i==0 && n2%i==0)
                 return i;
        }
        return 1;
    }

    //optimal gdc
    public static int findGcdOptimal(int n1, int n2){

        while(n1>0 && n2>0){
            if(n1>n2){
                n1= n1%n2;
            }else {
                n2= n2%n1;
            }
        }

        if(n1==0)
            return n2;

        return n1;

    }


    // armstrong

    public static boolean isArmStrong(int n){

        int res = 0;
        int inital= n;

        while(n>0){
            int rem = n % 10;
            res = res + rem*rem*rem;
            n= n/10;
        }

        return res==inital;


    }

    public static int[] findDivisor(int n, int[] size){

        int[] res = new int[n];

        int count=0;
        for (int i=1; i<=n; i++){
            if(n%i==0)
                res[count++]=i;
        }
        size[0]=count;
        return res;

    }

    //optimal divisior

    public static ArrayList<Integer> findDivisorsOptimal(int n) {
        // Initialize an empty
        // ArrayList to store the divisors
        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; ++i) {

            if (n % i == 0) {

                divisors.add(i);

                if (i != n / i) {

                    divisors.add(n / i);
                }
            }
        }

        // Return the list of divisors
        return divisors;
    }

    // check prime

    // bruteforce
    public static boolean isPrime(int n){

        int cnt = 0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n % i == 0) {

                cnt = cnt + 1;

                if (n / i != i) {
                    cnt = cnt + 1;
                }
            }
        }

        if(cnt==2)
            return true;
        else
            return false;

    }


}
