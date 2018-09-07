package solution;

import question.A189RotateArray;

public class A189O1SpaceON2Time implements A189RotateArray {

	private void swap(int[] nums, int i, int j) {
		int cache = nums[j];
		nums[j] = nums[i];
		nums[i] = cache;
	}

	@Override
	public void rotate(int[] nums, int k) {
		int end = nums.length;
		while (end != 0 && k != end) {
			int c = 0;
			rotateIter: while (true) {
				int i = 0;
				while (i < k) {
					int dest = i + c;
					if (dest >= end) {
						// update subarray rotate
						end = k;
						k = end - i;
						break rotateIter;
					} else {
						swap(nums, i, dest);
					}
					i++;
				}
				c += i;
			}
		}
	}

}
