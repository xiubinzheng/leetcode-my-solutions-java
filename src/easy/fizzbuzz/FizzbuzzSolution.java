package easy.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzbuzzSolution {
	/*
	    * Write a program that outputs the string representation of numbers from 1 to n.
	        But for multiples of three it should output “Fizz”
	        instead of the number and for the multiples of five output “Buzz”.
	        For numbers which are multiples of both three and five output “FizzBuzz”.
	        n = 15,
	        Return:
	        [
	            "1",
	            "2",
	            "Fizz",
	            "4",
	            "Buzz",
	            "Fizz",
	            "7",
	            "8",
	            "Fizz",
	            "Buzz",
	            "11",
	            "Fizz",
	            "13",
	            "14",
	            "FizzBuzz"
	        ]
	    * */
	    public static List<String> fizzBuzz(int n) {
	        List<String> resultList = new ArrayList<String>(n);
	        for (int i = 1; i <= n; i++) {
	            if (i % (3 * 5) == 0) {
	                resultList.add("FizzBuzz");
	            } else if (i % 3 == 0) {
	                resultList.add("Fizz");
	            } else if (i % 5 == 0) {
	                resultList.add("Buzz");
	            } else {
	                resultList.add(Integer.toString(i));
	            }
	        }
	        return resultList;

	    }
	    
	    public static List<String> fizzBuzzTwo(int n) {
	        List<String> ret = new ArrayList<String>(n);
	        for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
	            fizz++;
	            buzz++;
	            if (fizz == 3 && buzz == 5) {
	                ret.add("FizzBuzz");
	                fizz = 0;
	                buzz = 0;
	            } else if (fizz == 3) {
	                ret.add("Fizz");
	                fizz = 0;
	            } else if (buzz == 5) {
	                ret.add("Buzz");
	                buzz = 0;
	            } else {
	                ret.add(String.valueOf(i));
	            }
	        }
	        return ret;
	    }
	    
	    
	    public static void main(String[]args)
	    {
	    	for (String str : fizzBuzz(15)) {
	            System.out.println(str);
	        }
	    }

}
