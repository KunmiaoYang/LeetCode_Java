package leetcode.p3.p30.e300;

/**
 *
 * Created by admin on 2017/6/25.
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, count[] = new int[n], res = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) if(nums[j] < nums[i]) count[i] = Math.max(count[i], count[j]);
            res = Math.max(res, ++count[i]);
        }
        return res;
    }
}