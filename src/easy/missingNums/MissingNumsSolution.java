package easy.missingNums;

import java.util.ArrayList;
import java.util.List;

public class MissingNumsSolution {
	public static List<Integer> getMissingNums(int[] nums) {

		ArrayList<Integer> numList = new ArrayList<Integer>();
		ArrayList<Integer> results = new ArrayList<Integer>();
		for (int i : nums)
			numList.add(i);

		for (int i = 1; i < numList.size(); i++) {
			if (!numList.contains(i)) {
				results.add(i);
			}
		}

		return results;
	}

	public static void main(String[] args) {
		System.out.println(getMissingNums(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
	}
}
