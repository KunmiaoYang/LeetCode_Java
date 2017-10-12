package leetcode.p0.p04.e045;

/**
 *
 * Created by kunmiao.yang on 2017/6/6.
 */
public class Solution {
    public int jump(int[] nums) {
        if(2 > nums.length) return 0;
        int count = 1;
        for (int left = 1, right = nums[0]+1, range = 1; right<nums.length; count++, right = range+1) for(; left<right; left++) range = Math.max(range, left+nums[left]);
        return count;
    }
}