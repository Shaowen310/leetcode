package test;

import java.util.List;

import question.A44Permutation;
import solution.A44PermutationRecur;

public class A44PermutationTest {
	public static void main(String[] args) {
		A44Permutation sol = new A44PermutationRecur();
		int[] nums = { 1, 2, 3, 4 };
		List<List<Integer>> result = sol.permute(nums);
		System.out.println(result);
	}
}
