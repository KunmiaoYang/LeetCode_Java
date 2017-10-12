package leetcode.p0.p02.e027;

/**
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(null == nums) return 0;
        int n = nums.length-1;
        for (int i = 0; i<=n; i++) {
            if(nums[i]!=val) continue;
            while (i<n && nums[n] == val) n--;
            nums[i] = nums[n--];
        }
        return n+1;
    }
}