package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import question.A153FindMinimumInRotatedSortedArray;
import solution.A153;

public class A153Test {
	private A153FindMinimumInRotatedSortedArray sol = new A153();

	@Test
	public void testCase1() {
		int[] a = { 3, 4, 5, 1, 2 };
		assertEquals(1, sol.findMin(a));
	}

	@Test
	public void testCase2() {
		int[] a = { 4, 5, 6, 7, 0, 1, 2 };
		assertEquals(0, sol.findMin(a));
	}

}
