package leetcode.p0.p02.e026;

/**
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<2) return n;
        int p = 1, val = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == val) continue;
            val = nums[i];
            nums[p++] = val;
        }
        return p;
    }
}
