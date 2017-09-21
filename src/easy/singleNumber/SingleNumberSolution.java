package easy.singleNumber;

import java.util.HashMap;
import java.util.Map;


/*
 * Given an array of numbers nums, in which exactly two elements appear only
 * once and all the other elements appear exactly twice. Find the two elements that appear only once.

 For example:

 Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

 Note:
 The order of the result is not important. So in the above example, [5, 3] is also correct.
 Your algorithm should run in linear runtime complexity.
 Could you implement it using only constant space complexity?
 * **/
public class SingleNumberSolution {
public static int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        Object[] o = map.entrySet().toArray();
        
        for(Object obj: o){
            if(((Map.Entry<Integer,Integer>)obj).getValue()==1){
                return ((Map.Entry<Integer,Integer>)obj).getKey();
            }
            
        }
        
        return -1;
        
    }
	

public static void main(String[]args)
{
	
	
	/*for (int i : solution.singleNumber(new int[]{7, 4, 10, 1, 2, 1, 3, 2, 5})) {
        System.out.println("i: " + i);
    }*/
}

}
