package learn.DSA.ArrayHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	
	public static void main(String[] args) {
		String arr[] = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println( groupAnagrams(arr));
	}
	
	 public static List<List<String>> groupAnagrams(String[] strs) {
		 
		 Map<String, List<String>> map = new HashMap<>(); 
		
		 for(String str : strs) {
			
			 char [] c = str.toCharArray();
			 Arrays.sort(c);
			 String sortedStr = new String(c);
			map.putIfAbsent(sortedStr, new ArrayList<>());
			map.get(sortedStr).add(str);
			 

		 }
		 
		return new ArrayList<>(map.values());
	        
	  }

}
