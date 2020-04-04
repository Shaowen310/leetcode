package question;

/**
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown
 * to you beforehand.
 * </p>
 * <p>
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * </p>
 * <p>
 * Find the minimum element.
 * </p>
 * <p>
 * You may assume no duplicate exists in the array.
 * </p>
 * <p>
 * Example 1:
 * </p>
 * <p>
 * Input: [3,4,5,1,2] Output: 1
 * </p>
 * <p>
 * Example 2:
 * </p>
 * <p>
 * Input: [4,5,6,7,0,1,2] Output: 0
 * </p>
 * 
 * @author zhou_s-pc
 *
 */
public interface A153FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums);
}
