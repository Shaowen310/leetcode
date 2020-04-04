package question;

/**
 * <p>
 * Return the length of the shortest, non-empty, contiguous subarray of A with
 * sum at least K.
 * </p>
 * 
 * <p>
 * If there is no non-empty subarray with sum at least K, return -1.
 * </p>
 * 
 * <p>
 * Example 1:
 * </p>
 * 
 * <p>
 * Input: A = [1], K = 1 Output: 1
 * </p>
 * 
 * <p>
 * Example 2:
 * </p>
 * 
 * <p>
 * Input: A = [1,2], K = 4 Output: -1
 * </p>
 * 
 * <p>
 * Example 3:
 * </p>
 * 
 * <p>
 * Input: A = [2,-1,2], K = 3 Output: 3
 * </p>
 * 
 * <p>
 * Note:
 * </p>
 * 
 * <p>
 * 1 <= A.length <= 50000 -10 ^ 5 <= A[i] <= 10 ^ 5 1 <= K <= 10 ^ 9
 * </p>
 */
public interface A862ShortestSubarrayWithSumAtLeastK {
	public int shortestSubarray(int[] A, int K);
}
