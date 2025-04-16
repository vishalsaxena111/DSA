package learn.DSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {

		int[] arr = {10, 5, 10};
		int max= arr[0];
		int secondMax = arr[1];
		for(int i=2; i < arr.length; i++){
			if(max< arr[i])
				max = arr[i];

			if(secondMax< arr[i])
				secondMax= arr[i];
		}

		System.out.println( max > secondMax ? secondMax : max);

		//System.out.println( res);

		//SpringApplication.run(DsaApplication.class, args);
	}

}
