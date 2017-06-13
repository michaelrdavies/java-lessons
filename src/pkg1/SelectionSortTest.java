package pkg1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void testNull() {
		assertNull("Sorting a null should return null", SelectionSort.Sort(null));
	}
	
	@Test
	public void testSingleItem() {
		int[] singleItem = new int[1];
		singleItem[0] = 1;
		int[] expected = singleItem.clone();		
		assertArrayEquals("Array with single item should just return array", expected, SelectionSort.Sort(singleItem));
	}
	
	@Test
	public void testMultipleItems() {
		int[] multiItems = new int[3];
		multiItems[0] = 3;
		multiItems[1] = 2;
		multiItems[2] = 1;
		int[]expected = new int[3];
		expected[0] = 1;
		expected[1] = 2;
		expected[2] = 3;
		assertArrayEquals("Array with multiple items should be reversed", expected, SelectionSort.Sort(multiItems));
	}

}
