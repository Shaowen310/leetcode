package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import question.A665NonDecreasingArray;
import solution.A665;

public class A665Test {
	A665NonDecreasingArray sol = new A665();

	@Test
	public void testTrue() {
		int nums[] = { 4, 2, 3 };
		assertTrue(sol.checkPossibility(nums));
	}

	@Test
	public void testFalse() {
		int nums[] = { 4, 2, 1 };
		assertFalse(sol.checkPossibility(nums));
	}
}
