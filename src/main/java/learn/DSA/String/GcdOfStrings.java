package learn.DSA.String;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GcdOfStrings {
	
	public static void main(String[] args) {
//		Example 1:
//
//		Input: str1 = "ABCABC", str2 = "ABC"
//		Output: "ABC"
//		Example 2:
//
//		Input: str1 = "ABABAB", str2 = "ABAB"
//		Output: "AB"
//		Example 3:
//
//		Input: str1 = "LEET", str2 = "CODE"
//		Output: ""

		String str1= "ABCABC" , str2="ABC";




		System.out.println(gcdOfStrings(str1, str2));

;
	}
	
	
	 public static String gcdOfStrings(String str1, String str2) {

		char ch1[] =  str1.toCharArray();
		char ch2[] =  str2.toCharArray();

		 Map<Character, Integer > map = new HashMap<>();

		 for(char c : ch1 ){
			 map.put(c, 0);
		 }

		 for(char c : ch2){

			 if(map.get(c)==0)
			 	map.put(c,1);

		 }

		String res="";
		 for(Map.Entry<Character, Integer> m : map.entrySet()){

			 if(m.getValue()>0)
				 res = res + m.getKey();
		 }

		 return res.length()>1 ? res : "";
	    }

}
