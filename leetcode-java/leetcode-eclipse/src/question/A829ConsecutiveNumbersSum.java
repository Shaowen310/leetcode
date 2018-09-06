package question;

/**
 * <p>
 * Given a positive integer N, how many ways can we write it as a sum of
 * consecutive positive integers?
 * </p>
 * 
 * <p>
 * Example 1:
 * </p>
 *
 * <p>
 * Input: 5 Output: 2 Explanation: 5 = 5 = 2 + 3
 * </p>
 * 
 * <p>
 * Example 2:
 * </p>
 * 
 * <p>
 * Input: 9 Output: 3 Explanation: 9 = 9 = 4 + 5 = 2 + 3 + 4
 * </p>
 *
 * <p>
 * Example 3:
 * </p>
 *
 * <p>
 * Input: 15 Output: 4 Explanation: 15 = 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4
 * + 5
 * </p>
 * 
 * <p>
 * Note: 1 <= N <= 10 ^ 9.
 * </p>
 */
public interface A829ConsecutiveNumbersSum {
	public int consecutiveNumbersSum(int N);
}
