package easy.climbingstairs;

public class ClimbStairsSolution {
    public static int climbStairs(int n) {  
    	int [] memo = new int[n+1];
    	
        return helper(n,memo);
    }
    
    
    public static int helper(int n,int [] memo)
    {
    	
    	/*
    	 * memo[0]+ memo[1]
    	 * */
    	if(n<0){
    		return 0;
    	}
    	else
        if(n==1){
            return 1;
        }else if(memo[n]>0){
        	return memo[n];
        }else
        {
        	memo[n]= helper(n-1,memo)+helper(n-2,memo);
        	return memo[n];
        }
    }
    
    
    
    public static void main(String []args){
    	System.out.println(climbStairs(3));
    }
    
}