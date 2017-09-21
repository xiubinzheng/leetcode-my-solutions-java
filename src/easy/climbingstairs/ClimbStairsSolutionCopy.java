package easy.climbingstairs;

import java.util.Arrays;

public class ClimbStairsSolutionCopy {
	public static int climbStairs(int n) {
        /*
        (n-1)- n, (n-i)
        n-2
        
        */
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
       return helper(n,memo);
        
        
    }
    
    
    public static int helper(int n, int[] memo)
    {
        /**/
        
        if(n<0)return 0;
        else if(n==0)return 1;
        else if(memo[n]>-1){
                return memo[n];
            }else
        {
            memo[n] = helper(n-1,memo ) +helper(n-2,memo );
            return memo[n];
        }
    }
    
    
    
    public static void main(String []args){
    	System.out.println(climbStairs(3));
    }
    
}