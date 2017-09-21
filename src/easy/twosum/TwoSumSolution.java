package easy.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
	
	/**
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i != j)
                    if ((nums[i] + nums[j] == target)
                            ) {
                        result[0] = i;
                        result[1] = j;
                    }
            }
        }
        return result;
    }
    
     public static int[] twoSumAdvanced(int[] numbers, int target) {
         int[] result = new int[2];
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         for (int i = 0; i < numbers.length; i++) {
             if (map.containsKey(target - numbers[i])) {
                 result[1] = i;
                 result[0] = map.get(target - numbers[i]);
                 return result;
             }
             map.put(numbers[i], i);
         }
         return result;
     }

    
    
    public static void main(String []args)
    {
        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println("twoSumAdvanced: " + Arrays.toString(twoSumAdvanced(nums, 9)));


    }


}
