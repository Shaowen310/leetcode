package solution;

import question.A189RotateArray;

public class A189SwapO1SpaceONTimeRecur implements A189RotateArray {

	private void swap(final int[] nums, final int i, final int j) {
		final int cache = nums[j];
		nums[j] = nums[i];
		nums[i] = cache;
	}

	private void rotateRecur(final int[] nums, int k, int end) {
		if (end == 0) {
			return;
		}
		k %= end;
		if (k == 0) {
			return;
		}
		int c = k;
		while (true) {
			int i;
			for (i = 0; i < k; i++) {
				final int dest = i + c;
				if (dest >= end) {
					// update subarray rotate
					end = k;
					k = end - i;
					rotateRecur(nums, k, end);
					return;
				} else {
					swap(nums, i, dest);
				}
			}
			c += i;
		}
	}

	@Override
	public void rotate(final int[] nums, final int k) {
		rotateRecur(nums, k, nums.length);
	}

}
