package leetcode.p0.p02.e027;

/**
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution0 {
    public int removeElement(int[] nums, int val) {
        if(null == nums) return 0;
        int p = 0;
        for(int num: nums) if(val != num) nums[p++] = num;
        return p;
    }
}