package pkg1;

public class InsertionSort {

	public static int[] Sort(int[] unsorted) {
		// make sure not null
		// return if only one item
		int[] sorted = unsorted.clone();
		for (int i = 1; i < sorted.length; i++) {
			int current = sorted[i];
			int j = i - 1;
			while (j >= 0) {
				if (current < sorted[j]) {
					sorted[j+1] = sorted[j];					
				} else {
					break;
				}
				j--;
			}
			sorted[j+1] = current;
		}
		return sorted;
	}
}
