package leetcode.p0.p04.e045;

/**
 *
 * Created by kunmiao.yang on 2017/6/6.
 */
public class Solution0 {
    public int jump(int[] nums) {
        if(null == nums || 2 > nums.length) return 0;
        int count = 1;
        for (int left = 1, right = nums[0]+1; right<nums.length; count++) {
            int range = left;
            for(int i = left; i<right; i++)
                range = Math.max(range, i+nums[i]);
            left = right;
            right = range+1;
        }
        return count;
    }
}