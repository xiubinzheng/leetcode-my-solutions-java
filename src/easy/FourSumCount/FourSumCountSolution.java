package easy.FourSumCount;

import java.util.HashMap;
import java.util.Map;

public class FourSumCountSolution {
	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int zeroCount = 0;
        int arrLengh = A.length;
        int sum = 0;

        for (int i : A) {
            for (int k : B) {
                System.out.println("i: " + i + " k: " + k);
                sum = i + k;
                System.out.println("sum: " + sum);
            }
        }


        for (int i : C) {
            for (int k : D) {
                System.out.println("i: " + i + " k: " + k);
                sum = i + k;
                System.out.println(" new sum: " + sum);
            }
        }


        System.out.println("sum: " + sum);


        return zeroCount;
    }

    public static int fourSumCount2(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                res += map.getOrDefault(-1 * (A[i] + B[j]), 0);
            }
        }

        return res;
    }
    
    
    public static void main(String[]args)
    {
        System.out.println(fourSumCount(new int[]{1, 8}, new int[]{7, 8}, new int[]{3, 16}, new int[]{4, 24}));

    }
}
