package easy.reverseNumbers;

public class ReverseNumberSolution {
	public static int reverse(int x) {

        int result = 0;

        String xString = Integer.toString(x);


        StringBuilder stringBuilder = new StringBuilder();

        if (xString.charAt(0) != '-') {
            for (int i = xString.length() - 1; i >= 0; i--) {
                stringBuilder.append(xString.charAt(i));
            }
        } else {
                /*
                * skip index 0 since index 0 is '-' in this case
                * **/
            for (int i = xString.length() - 1; i >= 1; i--) {
                stringBuilder.append(xString.charAt(i));
            }

            stringBuilder.insert(0, "-");
        }

        try {

            result = Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return result;

    }
	
	public static int reverse2(int x) {

        int result = 0;

        String xString = Integer.toString(x);


        String str = "";

        if (xString.charAt(0) != '-') {
            for (int i = xString.length() - 1; i >= 0; i--) {
                str += xString.charAt(i);
            }
        } else {
                /*
                * skip index 0 since index 0 is '-' in this case
                * **/
            for (int i = xString.length() - 1; i >= 1; i--) {
                str += xString.charAt(i);
            }
            str = '-' + str;
        }

        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }

        return result;

    }
	
	public static int reverse3(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -1 * x;
        }
        int remainder = 0;

        while (x > 0) {

            int newResult = remainder * 10 + x % 10;
            if ((newResult - x % 10) / 10 != remainder) {
                return 0;
            }
            remainder = newResult;


            x /= 10;
        }

        if (isNegative)
            return -1 * remainder;
        else return remainder;
    }
	
	public static long reverseInt(int x) {

        String xString = Integer.toString(x);


        StringBuilder stringBuilder = new StringBuilder();


        if (xString.charAt(0) != '-') {
            for (int i = xString.length() - 1; i >= 0; i--) {
                stringBuilder.append(xString.charAt(i));
            }
        } else {
                /*
                * skip index 0 since index 0 is '-' in this case
                * **/
            for (int i = xString.length() - 1; i >= 1; i--) {
                stringBuilder.append(xString.charAt(i));
            }

            stringBuilder.insert(0, "-");
        }
        return Long.parseLong(stringBuilder.toString());
    }


	
	public static void main(String[]args){
		System.out.println(reverse3(-321));
        System.out.println(reverse3(1534236469));
		System.out.println(reverseInt(964632435));
	}
	
	

}
