package easy.reversewords;

public class ReverseWordsSolution {
	public static String reverseWords(String s) {

        if (s.trim().equals("") || s.length() == 1 || s.trim().length() == 1) return s.trim();

        String[] strArray = s.trim().split(" ");
        StringBuilder strBuild = new StringBuilder();
        for (int i = strArray.length - 1; i >= 0; i--)
            if (i == 0)
                strBuild.append(strArray[i]);
            else
                strBuild.append(" " + strArray[i]);


        return strBuild.toString().trim();
    }
	
	public static void main(String[]args)
	{
		System.out.println(reverseWords("the sky is blue"));
	}


}
