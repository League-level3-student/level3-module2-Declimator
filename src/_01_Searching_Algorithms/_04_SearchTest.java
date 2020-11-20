package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] listone = {"one", "two", "three", "four"};
	String[] listtwo = {"a", "b", "c", "d"};
	String[] listthree = {};
	int[] list1 = {1, 2, 3, 4, 5};
	int[] list2 = {3, 5, 7, 9, 11};
	int[] list3 = {2, 3, 5, 6, 15};
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(_00_LinearSearch.linearSearch(listone, "two"), 1);
		assertEquals(_00_LinearSearch.linearSearch(listtwo,"c"), 2);
		assertEquals(_00_LinearSearch.linearSearch(listthree, "test"), -1);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(_01_BinarySearch.binarySearch(list1, 0, list1.length-1, 3), 2);
		assertEquals(_01_BinarySearch.binarySearch(list2, 0, list2.length-1, 4), -1);
		assertEquals(_01_BinarySearch.binarySearch(list3, 0, list3.length-1, 3), 1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
