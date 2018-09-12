package question;

import java.util.List;

/**
 * <p>
 * Given a collection of distinct integers, return all possible permutations.
 * </p>
 * 
 * <p>
 * Example:
 * </p>
 * 
 * <p>
 * Input: [1,2,3]<br>
 * Output: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
 * </p>
 */
public interface A46Permutation {
	public List<List<Integer>> permute(int[] nums);
}
