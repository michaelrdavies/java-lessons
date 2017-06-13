package pkg1;

public class BinarySearch {

	public static boolean Find(int needle, int[] haystack) {
		int maxIndex = haystack.length - 1;
		int minIndex = 0;
		while (minIndex < maxIndex) {
			int middle = (maxIndex + minIndex) / 2;
			if (needle == haystack[middle]) {
				return true;
			}
			else if (needle < haystack[middle]) {
				maxIndex = middle - 1;
			}
			else {
				minIndex = middle + 1;				
			}			
		}
		if (haystack[minIndex] == needle) {
			return true;
		}
		return false;
	}
}
