package solution;

import question.A153FindMinimumInRotatedSortedArray;

public class A153 implements A153FindMinimumInRotatedSortedArray {

	private int findMinRecur(int[] nums, int s, int e) {
		/**
		 * s index start; e index end; m index middle floor((s+e)/2)
		 */
		// assert(s <= e)
		if (s == e || nums[s] <= nums[e]) {
			return nums[s];
		}
		// else: s != e && nums[s] > nums[e]
		int m = (s + e) / 2;
		return Math.min(findMinRecur(nums, s, m), findMinRecur(nums, m + 1, e));
	}

	@Override
	public int findMin(int[] nums) {
		if (nums.length == 0) {
			throw new IllegalArgumentException("nums should contain at least one number.");
		}
		return findMinRecur(nums, 0, nums.length - 1);
	}

}
