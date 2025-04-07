package learn.DSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {

		int[] arr = {2, 2, 4 ,2};
		Map<Integer, Integer> map = new HashMap<>();

		for(int i=0; i<arr.length; i++){
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
			System.out.println(map);
		}

		List<Integer> res = new ArrayList<>();
		for(int i =1; i<= arr.length; i++){
			res.add(map.getOrDefault(i,0));
		}

		System.out.println( res);

		//SpringApplication.run(DsaApplication.class, args);
	}

}
