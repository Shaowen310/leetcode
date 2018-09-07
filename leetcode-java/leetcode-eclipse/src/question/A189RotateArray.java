package question;

/**
 * <p>
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * </p>
 * 
 * <p>
 * Example 1:
 * </p>
 * 
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * </p>
 * <p>
 * Output: [5,6,7,1,2,3,4]
 * </p>
 * <p>
 * Explanation: rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to
 * the right: [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * </p>
 * 
 * <p>
 * Note:
 * </p>
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different
 * ways to solve this problem.
 * </p>
 * <p>
 * Could you do it in-place with O(1) extra space?
 * </p>
 */
public interface A189RotateArray {
	public void rotate(int[] nums, int k);
}
