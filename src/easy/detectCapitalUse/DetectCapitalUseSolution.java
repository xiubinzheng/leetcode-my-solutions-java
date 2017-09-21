package easy.detectCapitalUse;

public class DetectCapitalUseSolution {
	
	public static boolean detectCapitalUse(String word) {
        int numOfUpper = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)))
                numOfUpper++;
        }

        if (numOfUpper == word.length())
            return true;
        else
            return false;
    }
	
	public static void main(String[]args)
	{
		System.out.println("detectCapitalUse: " + detectCapitalUse("USA"));
        System.out.println("detectCapitalUse: " + detectCapitalUse("USa"));
        System.out.println("detectCapitalUse: " + detectCapitalUse("uSa"));
        System.out.println("detectCapitalUse: " + detectCapitalUse("usa"));
	}
}
