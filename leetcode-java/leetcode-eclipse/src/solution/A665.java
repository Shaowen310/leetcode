package solution;

import question.A665NonDecreasingArray;

/**
 * Note that this solution modifies the original array, snapshot the modified
 * value can solve this issue.
 * 
 * @author zhou_s-pc
 *
 */
public class A665 implements A665NonDecreasingArray {

	@Override
	public boolean checkPossibility(int[] nums) {
		boolean foundNd = false;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				if (foundNd) {
					return false;
				} else {
					foundNd = true;
					if (i < 2 || nums[i] >= nums[i - 2]) {
						nums[i - 1] = nums[i];
					} else {
						nums[i] = nums[i - 1];
					}
				}
			}
		}
		return true;
	}

}
