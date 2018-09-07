package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import question.A189RotateArray;
import solution.A189SwapO1SpaceONTime;

public class A189Test {
	private A189RotateArray sol = new A189SwapO1SpaceONTime();

	@Test
	public void test() {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 6;
		sol.rotate(nums, k);
		int expected[] = { 2, 3, 4, 5, 6, 7, 1 };
		assertArrayEquals(expected, nums);
	}

	@Test
	public void testNoRotate() {
		int nums[] = { 1 };
		int k = 0;
		sol.rotate(nums, k);
		int expected[] = { 1 };
		assertArrayEquals(expected, nums);
	}

	@Test
	public void testKLargerThanArrayLength() {
		int nums[] = { 1, 2 };
		int k = 3;
		sol.rotate(nums, k);
		int expected[] = { 2, 1 };
		assertArrayEquals(expected, nums);
	}

	@Test
	public void testEmptyArray() {
		int nums[] = {};
		int k = 1;
		sol.rotate(nums, k);
		int expected[] = {};
		assertArrayEquals(expected, nums);
	}
}
