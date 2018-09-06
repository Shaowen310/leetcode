package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import question.A862ShortestSubarrayWithSumAtLeastK;
import solution.A862SlidingWindow;

public class A862Test {

	private A862ShortestSubarrayWithSumAtLeastK sol = new A862SlidingWindow();

	@Test
	public void testArrayContainsOnlyPositiveNumbers() {
		int A[] = { 2, 1, 1, 1, 3 };
		int K = 4;
		assertEquals(2, sol.shortestSubarray(A, K));
	}

	@Test
	public void testArrayWithNegativeNumberStTotalSumSmallerThanK() {
		int A[] = { 84, -37, 32, 40, 95 };
		int K = 167;
		assertEquals(3, sol.shortestSubarray(A, K));
	}

	@Test
	public void testArrayEndsWithNegativeSum() {
		int A[] = { 84, -37, 32, 40, 95, -2, 1 };
		int K = 167;
		assertEquals(3, sol.shortestSubarray(A, K));
	}

}
