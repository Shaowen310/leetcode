package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import question.A189RotateArray;
import solution.A189O1SpaceON2Time;

public class A189Test {
	private A189RotateArray sol = new A189O1SpaceON2Time();

	@Test
	public void test() {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		sol.rotate(nums, k);
		int expected[] = { 5, 6, 7, 1, 2, 3, 4 };
		assertArrayEquals(expected, nums);
	}
}
