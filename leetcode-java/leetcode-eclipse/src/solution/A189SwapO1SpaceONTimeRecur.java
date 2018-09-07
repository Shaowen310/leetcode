package solution;

import question.A189RotateArray;

public class A189SwapO1SpaceONTimeRecur implements A189RotateArray {

	private void swap(int[] nums, int i, int j) {
		int cache = nums[j];
		nums[j] = nums[i];
		nums[i] = cache;
	}

	private void rotateRecur(int[] nums, int k, int end) {
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
				int dest = i + c;
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
	public void rotate(int[] nums, int k) {
		rotateRecur(nums, k, nums.length);
	}

}
