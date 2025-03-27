package learn.DSA.ArrayHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
	
	public static void main(String[] args) {
		List<String> l = Arrays.asList("");
		decode(encode(l));
		
	}
	
	
		 public static String encode(List<String> strs) {
			 
			 StringBuilder sb =new StringBuilder();
			 
			 for(String str : strs) {
				for( char c: str.toCharArray()) {
				int i = c;
				sb.append(i+""); 
				sb.append(".");
				}
				sb.append("#");
			 }
			 
			 System.out.println(sb.toString());
			return sb.toString();
	
		    }
	
		    public static List<String> decode(String str) {
				
		       String[] sArr=	str.split("#");
		       List<String> res = new ArrayList<>();
		       
		       for(String s : sArr ) {
		    	   String r = "";
		    	  for(String c : s.split("\\.")) {
		    		  
		    		  char cs = (char) Integer.parseInt(c);
		    		
		    		  r= r+ cs;
		    	  }
		    	  res.add(r);
		    	   
		    	  
		       }
		       
		       System.out.println(res);
		    	
		       
		    	return  res.isEmpty() ? Arrays.asList("") : res;
	
		    }
	    
	    

}
