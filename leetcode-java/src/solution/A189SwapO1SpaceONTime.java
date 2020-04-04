package solution;

import question.A189RotateArray;

public class A189SwapO1SpaceONTime implements A189RotateArray {

	private void swap(final int[] nums, final int i, final int j) {
		final int cache = nums[j];
		nums[j] = nums[i];
		nums[i] = cache;
	}

	@Override
	public void rotate(final int[] nums, int k) {
		int end = nums.length;
		while (end != 0) {
			k %= end;
			if (k == 0) {
				return;
			}
			int c = k;
			rotateIter: while (true) {
				int i;
				for (i = 0; i < k; i++) {
					final int dest = i + c;
					if (dest >= end) {
						// update subarray rotate
						end = k;
						k = end - i;
						break rotateIter;
					} else {
						swap(nums, i, dest);
					}
				}
				c += i;
			}
		}
	}

}
