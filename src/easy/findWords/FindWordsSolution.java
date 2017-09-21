package easy.findWords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindWordsSolution {
	public static String[] findWords(String[] words) {
        String[] keyboardrows = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        String[] result;

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (int i = 0; i < keyboardrows.length; i++) {

            for (char c : keyboardrows[i].toCharArray()) {
                charMap.put(c, i);
            }
        }
        List<String> res = new LinkedList<String>();
        for (String str : words) {
            if (str.equals("")) continue;
            int index = charMap.get(str.toUpperCase().charAt(0));
            System.out.println("index: " + index);
            for (char c : str.toUpperCase().toCharArray()) {
                if (charMap.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) res.add(str);
        }
        return res.toArray(new String[0]);
    }
	
	public static void main(String []args)
	{
		 	String[] strs = {"Hello", "Alaska", "Dad", "Peace"};
	        System.out.println("findWords: " + Arrays.toString(findWords(strs)));
	}
}
