package easy.findnextlarger;

public class FindNextLarger {

	public static void main(String[] args) {

		int[] arr = { -14, -10, 2, 108, 108, 243, 285, 285, 285, 401 };
		int[] arr2 = { -14, -10, 2, 108, 108, 243, 285, 285, 285, 401 };

		System.out.println(getLocation(arr, -13));
	}

	public static int getLocation(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			System.out.println(mid);

			if (arr[mid] < target) {
				left = mid + 1;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else if (arr[mid] == target) {

				while (arr[mid] == target) {
					mid++;
					if (arr[mid] > target) {
						return mid;
					}
				}
			}

		}
		return -1;
	}

}

