package learn.DSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Stack;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		String s="(()())(())(()(()))";
		Stack<Character> st = new Stack();
		char[] c = s.toCharArray();

		for(int i=0; i<c.length; i++){
			if(st.isEmpty())
				st.push(c[i]);
			else{
				System.out.println("i"+i+" "+c[i]+" "+st.peek());
				if(c[i]==st.peek()) {
					st.pop();
					st.push(c[i]);
					//continue;
				}else st.push(c[i]);

			}

			StringBuilder sb = new StringBuilder();
			for(char ct: st)
				sb.append(ct);

		}

		System.out.println(st);

		//SpringApplication.run(DsaApplication.class, args);
	}

}
