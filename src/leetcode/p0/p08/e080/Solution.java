package leetcode.p0.p08.e080;

/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, count = 0, val, p = 2;
        if(n < 3) return n;
        val = nums[1];
        if(nums[0] ==  nums[1]) count++;
        for(int i = 2; i < n; i++) {
            if (nums[i] != val) {
                count = 0;
                val = nums[i];
                nums[p++] = val;
            } else if(1 > count++) nums[p++] = val;
        }
        return p;
    }
}