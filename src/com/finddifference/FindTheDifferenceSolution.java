package com.finddifference;

public class FindTheDifferenceSolution {
	
	public static char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            sum1 += s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            sum2 += t.charAt(i);
        }

        int a = sum2 - sum1;
        System.out.println("sum2: " + sum2);
        System.out.println("sum1: " + sum1);
        System.out.println("int a: " + a);

        char c = (char) (a);
        return c;
    }
	
public static void main(String []args)
{
    System.out.println("findTheDifference: " + findTheDifference("abcd", "abcde"));
}

}
