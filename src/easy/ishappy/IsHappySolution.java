package easy.ishappy;

import java.util.HashSet;

public class IsHappySolution {
	public static boolean isHappy2(int n) {

        HashSet<Integer> numSet = new HashSet<Integer>();
        int remainder, square;

        while (numSet.add(n)) {
            square = 0;
            while (n > 0) {

                remainder = n % 10;
                square += remainder * remainder;
                System.out.println("square: " + square);
                n /= 10;
            }


            if (square == 1)
                return true;
            else
                n = square;
        }

        return false;

    }
	
	public static boolean isHappy(int n) {

        int remainder = 0, offset = 0;
        while (n > 0) {
            System.out.println(n);

            if (n == 1) {
                return true;
            } else if (n > 1) {
                remainder = n % 10;
                offset = n / 10;
                n = remainder * remainder + offset * offset;
            }
        }
        return false;
    }
	
	
	public static void main(String[]args){
		System.out.println(isHappy(133));
        System.out.println("2: " + isHappy2(2));
        System.out.println("3: " + isHappy2(3));
        System.out.println("4: " + isHappy2(4));
        System.out.println("5: " + isHappy2(5));
        System.out.println("6: " + isHappy2(6));
        System.out.println("7: " + isHappy2(7));
        System.out.println("8: " + isHappy2(8));
        System.out.println("9: " + isHappy2(9));
        System.out.println("10: " + isHappy2(10));
        System.out.println("11: " + isHappy2(11));
	}

}
