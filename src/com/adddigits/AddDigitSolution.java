package com.adddigits;

public class AddDigitSolution {
	/*
	    * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

	    For example:

	    Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

	    Follow up:
	    Could you do it without any loop/recursion in O(1) runtime?

	    Credits:
	    Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

	    Subscribe to see which companies asked this question.
	    * **/

	    public static int addDigits(int num) {
	        String numString = Integer.toString(num);
	        int result = 0;
	        for (int i = 0; i < numString.length(); i++) {
	            result += Integer.parseInt("" + numString.charAt(i));
	        }
	        if (Integer.toString(result).length() > 1) {
	            System.out.println("Hi I am here");
	            result = addDigits(result);
	        }

	        return result;
	    }
	    
	    public static void main(String[]args)
	    {
	        System.out.println(" 38 addDigits: " + addDigits(38));

	    }

}
