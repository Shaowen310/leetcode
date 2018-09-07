package solution;

import question.A189RotateArray;

public class A189ReverseO1SpaceO2NTime implements A189RotateArray {

	private void swap(int[] nums, int i, int j) {
		int cache = nums[j];
		nums[j] = nums[i];
		nums[i] = cache;
	}

	private void reverse(int[] nums, int start, int end) {
		for (int i = start, j = end - 1; i < j; i++, j--) {
			swap(nums, i, j);
		}
	}

	@Override
	public void rotate(int[] nums, int k) {
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
