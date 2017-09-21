package easy.frequencysort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FrequencySortSolution {
	public static String frequencySort(String s) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        StringBuilder strBuild = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), 1);
            } else {
                charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
            }
        }

        Object[] a = charMap.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<Character, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<Character, Integer>) o1).getValue());
            }
        });
        for (Object e : a) {
            System.out.println(((Map.Entry<Character, Integer>) e).getKey() + " : "
                    + ((Map.Entry<Character, Integer>) e).getValue());

            for (int k = 0; k < ((Map.Entry<Character, Integer>) e).getValue(); k++) {
                strBuild.append(((Map.Entry<Character, Integer>) e).getKey());
            }
        }
        return strBuild.toString();
    }
	
	public static void main(String[]args)
	{
        System.out.println("xxxxxxx: " + frequencySort("tttrrghepp9jpmnmnmnm"));

	}

}
