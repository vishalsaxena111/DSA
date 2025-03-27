package learn.DSA.Maths;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		   
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        // Reading input
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Check for null or invalid inputs
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null || s[i].trim().isEmpty()) {
                System.err.println("Invalid input detected: Empty or null string at index " + i);
                return; // Exit the program as input is invalid
            }
        }

        // Sorting using Arrays.sort with a custom comparator
        Arrays.sort(s, (a, b) -> {
            BigDecimal A = new BigDecimal(a);
            BigDecimal B = new BigDecimal(b);

            // Compare B to A for descending order
            return B.compareTo(A);
        });

        // Output the sorted array
        for (String value : s) {
            System.out.println(value);
        }
 
	}
	
	  public static int reverse(int x) {
		  
		  int res =0;
		  while(x!=0) {

			  int d = x%10;
			  
			  if( res >= Integer.MAX_VALUE/10 && d>7)
				  return 0;
			  if( res <= Integer.MIN_VALUE/10 && d< -8) 
				  return 0;
			  
			  res = res * 10 +  d;
			  x = x/10;
		  }
		  
		  
		  return res;
	        
	   }
}
