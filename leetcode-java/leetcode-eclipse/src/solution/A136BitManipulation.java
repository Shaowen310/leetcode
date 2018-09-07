package solution;

import question.A136SingleNumber;

public class A136BitManipulation implements A136SingleNumber {

	@Override
	public int singleNumber(int[] nums) {
		int singleNum = 0;
		for (int num : nums) {
			singleNum ^= num;
		}
		return singleNum;
	}

}
