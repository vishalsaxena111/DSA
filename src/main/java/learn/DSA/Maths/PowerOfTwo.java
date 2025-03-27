package learn.DSA.Maths;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwoUsingBit(44));
	}
	
	//Using recursion 
		 public static boolean isPowerOfTwo(int n) {
		        if(n<=0)
		            return false;
		        if(n%2==0)
		            return isPowerOfTwo(n/=2);
		        return n==1 ;
		 }
	 
	//Using bit 
		 public static boolean isPowerOfTwoUsingBit(int n) {
			 return n> 0 && (n&(n-1))==0;
		 }

}
