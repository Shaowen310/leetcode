package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import question.A136SingleNumber;
import solution.A136BitManipulation;

public class A136Test {
	private A136SingleNumber sol = new A136BitManipulation();

	@Test
	public void test() {
		int nums[] = { 4, 1, 2, 1, 2 };
		assertEquals(4, sol.singleNumber(nums));
	}
}
