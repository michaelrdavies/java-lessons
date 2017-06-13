package pkg1;

public class SelectionSort {

	public static int[] Sort(int[] integers) {
		if (integers == null) {
			return null;
		}
		if (integers.length == 1) {
			return integers;
		}
		int[] sorted = integers.clone();
		for (int i = 0; i < sorted.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < sorted.length; j++) {
				if (sorted[j] < sorted[i]) {
					minIndex = j;
				}
			}
			int tmp = sorted[i];
			sorted[i] = sorted[minIndex];
			sorted[minIndex] = tmp;
		}
		return sorted;
	}
	
}

