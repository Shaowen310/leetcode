package solution;

import question.A189RotateArray;

public class A189ReverseO1SpaceO2NTime implements A189RotateArray {

	private void swap(final int[] nums, final int i, final int j) {
		final int cache = nums[j];
		nums[j] = nums[i];
		nums[i] = cache;
	}

	private void reverse(final int[] nums, final int start, final int end) {
		for (int i = start, j = end - 1; i < j; i++, j--) {
			swap(nums, i, j);
		}
	}

	@Override
	public void rotate(final int[] nums, int k) {
		if (nums.length == 0) {
			return;
		}
		k %= nums.length;
		if (k == 0) {
			return;
		}
		reverse(nums, 0, nums.length);
		reverse(nums, 0, k);
		reverse(nums, k, nums.length);
	}

}
