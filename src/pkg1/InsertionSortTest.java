package pkg1;

import static org.junit.Assert.*;
import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void testMultipleItems() {
		int[] input = new int[3];
		input[0] = 3;
		input[1] = 2;
		input[2] = 1;
		int[] expected = new int[3];
		expected[0] = 1;
		expected[1] = 2;
		expected[2] = 3;
		assertArrayEquals("Multiple items were not sorted correctly", expected, InsertionSort.Sort(input));
	}
}
