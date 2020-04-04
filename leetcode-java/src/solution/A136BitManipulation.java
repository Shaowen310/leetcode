package solution;

import question.A136SingleNumber;

public class A136BitManipulation implements A136SingleNumber {

	@Override
	public int singleNumber(final int[] nums) {
		int singleNum = 0;
		for (final int num : nums) {
			singleNum ^= num;
		}
		return singleNum;
	}

}
