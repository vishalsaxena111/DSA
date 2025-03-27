package learn.DSA.String;

import java.util.Stack;

public class ReverseVowel {

    public static void main(String[] args) {
        String s= "IceCreAm";

        System.out.println(reverseVowels(s));

    }

    public static  String reverseVowels(String s) {

        String vowels= "aeiouAEIOU";

        char c[] = s.toCharArray();

        Stack<Character> stack =  new Stack<>();

        for(int i=0; i< s.length(); i++) {

            if( vowels.contains( s.charAt(i)+"")) {
                stack.push(s.charAt(i));
                s = s.replaceFirst(s.charAt(i)+"", "_");

            }

        }



        for(int i=0; i< s.length()-1; i++) {

            if(  s.charAt(i)=='_' ) {

                s = s.replaceFirst(s.charAt(i)+"", stack.pop()+"");


            }

        }
        return s;

    }

}
