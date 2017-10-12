package leetcode.p0.p05.e055;

/**
 *
 * Created by admin on 2017/6/13.
 */
public class Solution0 {
    public boolean canJump(int[] nums) {
        if(nums.length > 1) {
            int left = 0, right = 1, range = 0;
            while (right < nums.length) {
                if(left == right) return false;
                for (; left < right; left++) range = Math.max(range, left + nums[left]);
                right = range + 1;
            }
        }
        return true;
    }
}