package question;

/**
 * <p>
 * Given an array with n integers, your task is to check if it could become
 * non-decreasing by modifying at most 1 element.
 * </p>
 * 
 * <p>
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for
 * every i (1 <= i < n).
 * </p>
 * 
 * <p>
 * Example 1:
 * </p>
 * 
 * <p>
 * Input: [4,2,3]
 * </p>
 * <p>
 * Output: True
 * </p>
 * <p>
 * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 * </p>
 * 
 * <p>
 * Example 2:
 * </p>
 * 
 * <p>
 * Input: [4,2,1]
 * </p>
 * <p>
 * Output: False
 * </p>
 * <p>
 * Explanation: You can't get a non-decreasing array by modify at most one
 * element.
 * </p>
 * 
 * <p>
 * Note: The n belongs to [1, 10,000].
 * </p>
 */
public interface A665NonDecreasingArray {
	public boolean checkPossibility(int[] nums);
}
