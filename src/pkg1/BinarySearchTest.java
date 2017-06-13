package pkg1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testOddItemsHit() {
		int[] items = new int[5];
		items[0] = 0;
		items[1] = 1;
		items[2] = 2;
		items[3] = 3;
		items[4] = 4;
		assertTrue(BinarySearch.Find(2, items));
	}

	@Test
	public void testOddItemsMiss() {
		int[] items = new int[5];
		items[0] = 0;
		items[1] = 1;
		items[2] = 2;
		items[3] = 3;
		items[4] = 4;
		assertFalse(BinarySearch.Find(5, items));
	}

	@Test
	public void testEventemsHit() {
		int[] items = new int[4];
		items[0] = 0;
		items[1] = 1;
		items[2] = 2;
		items[3] = 3;
		assertTrue(BinarySearch.Find(2, items));
	}

	@Test
	public void testEvenItemsMiss() {
		int[] items = new int[4];
		items[0] = 0;
		items[1] = 1;
		items[2] = 2;
		items[3] = 3;
		assertFalse(BinarySearch.Find(-1, items));
	}

}
