package leetcode.p0.p05.e053;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0, sum = 0; i<nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            sum = Math.max(sum, 0);
        }
        return maxSum;
    }
}
