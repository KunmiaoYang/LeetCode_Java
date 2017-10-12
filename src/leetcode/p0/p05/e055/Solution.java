package leetcode.p0.p05.e055;

/**
 *
 * Created by admin on 2017/6/13.
 */
public class Solution {
    public boolean canJump(int[] nums) {
        for (int left = 0, right = 0; right < nums.length-1; left++) {
            if(left > right) return false;
            right = Math.max(right, left + nums[left]);
        }
        return true;
    }
}