package learn.DSA.ArrayHashing;

import java.util.HashMap;
import java.util.Map;

public class pproductExceptSelf {

	public static void main(String[] args) {
		int[] a= {1,2,4,6};
		int[] b= {-1,0,1,2,3};
		productExceptSelf(b);
	}
	
	 public static int[] productExceptSelf(int[] nums) {
		
		int i =0;
		
		 Map<Integer,Integer> map = getSuffix(nums,1,i+1);
		 int[] res = new int[nums.length];
		 
		int key= map.keySet().iterator().next();
		
		int zero = res[key];
		 
		 
		 for(int j=0 ;j<nums.length; j++) {
			if(zero==0) {
				if(map.containsKey(j)) {
					 res[j]= map.get(key);
				}else
					res[j]=0;
			}else {
			 if(!map.containsKey(j)) {
				 res[j]= map.get(key)/nums[j];
			 }
			 else {
				 res[j]= map.get(key);
			 }
			}
		 }
		
		 
		 for(int k: res) {
			 System.err.print(k+" ");
		 }
		 
		 
		 return nums;
	    }
	 
	 public static Map<Integer,Integer> getSuffix(int[] nums, int suffix, int i){
		 System.out.println("i" +i);
		 int count=i;
		 Map<Integer,Integer> map= new HashMap<>();
		 for( ;i<nums.length; i++) {

			 suffix = suffix*nums[i];
			 System.out.println("suffix in "+suffix);
			 	
			 
		 }
		 System.out.println("suffix out"+suffix);
		 map.put(count-1, suffix);
		 if(suffix==0)
			 	map= getSuffix(nums,1,count+1);
		 
		 int key= map.keySet().iterator().next();
		 if(key!=0 && suffix!=0) {
			 System.out.println("ye"+suffix);
			 for(int l=0; l<key; l++)
				 suffix = suffix* nums[l];
			 System.out.println("in minus"+suffix);
			 System.out.println("map a"+map);
			 map.clear();
			 map.put(count-1, suffix);
		 }
		 
		
		 System.out.println("map b"+map);
		 return map;
	 }
	
	 
}
