package solution;

import java.util.Arrays;

import question.A862ShortestSubarrayWithSumAtLeastK;

/**
 * This solution only works if given array contains only positive numbers.
 * Because it can be proved that there is no other left boundary change solution
 * if right boundary updates given this condition.
 * 
 * @author zhou_s-pc
 *
 */
public class A862SlidingWindow implements A862ShortestSubarrayWithSumAtLeastK {

	@Override
	public int shortestSubarray(final int[] A, final int K) {
		int left = 0;
		int right = 1;
		int sum = 0;
		int arrLen = Integer.MAX_VALUE;
		boolean found = false;
		while (right <= A.length) {
			// First find sub-array satisfy a[left,right) >= k
			sum += A[right - 1];
			// Found sub-array satisfy condition, try to squeeze
			while (sum >= K && left < right) {
				found = true;
				arrLen = Math.min(arrLen, right - left);
				sum -= A[left];
				left++;
			}
			right++;
		}
		return found ? arrLen : -1;
	}

	public static void main(final String[] args) {
		final A862SlidingWindow sol = new A862SlidingWindow();
		final int[] A = { 2, -1, 2 };
		final int K = 3;
		System.out.println("a - " + Arrays.toString(A));
		System.out.println("k = " + K);
		System.out.println(sol.shortestSubarray(A, K));

		final int[] A1 = { 84, -37, 32, 40, 95 };
		final int K1 = 167;
		System.out.println("a - " + Arrays.toString(A1));
		System.out.println("k = " + K1);
		System.out.println(sol.shortestSubarray(A1, K1));
	}

}
