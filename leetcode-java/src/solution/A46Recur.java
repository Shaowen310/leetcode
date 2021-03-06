package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import question.A46Permutation;

public class A46Recur implements A46Permutation {
	private List<List<Integer>> permuteRecur(final List<Integer> interResult, final List<Integer> nums) {
		final List<List<Integer>> result = new ArrayList<>();
		if (nums.isEmpty()) {
			result.add(interResult);
		} else {
			for (int i = 0; i < nums.size(); i++) {
				final List<Integer> newInterResult = new ArrayList<>(interResult);
				newInterResult.add(nums.get(i));
				final List<Integer> numsCopy = new ArrayList<>(nums);
				numsCopy.remove(i);
				result.addAll(permuteRecur(newInterResult, numsCopy));
			}
		}
		return result;
	}

	@Override
	public List<List<Integer>> permute(final int[] nums) {
		return permuteRecur(new ArrayList<>(), Arrays.stream(nums).boxed().collect(Collectors.toList()));
	}

	public static void main(final String[] args) {
		final A46Permutation sol = new A46Recur();
		final int[] nums = { 1, 2, 3, 4 };
		final List<List<Integer>> result = sol.permute(nums);
		System.out.println(result);
	}
}
