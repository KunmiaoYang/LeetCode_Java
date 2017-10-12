package leetcode.p0.p01.e016;

import java.util.Arrays;

/**
 * Created by admin on 2017/5/18.
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length, minResidual = Integer.MAX_VALUE,
                residual, twoTarget, j, k;
        for(int i = 0; i<n-2; i++) {
            twoTarget = target - nums[i];
            j = i + 1; k = n - 1;
            while (j<k) {
                residual = twoTarget - nums[j] - nums[k];
                if(Math.abs(residual)<Math.abs(minResidual)) minResidual = residual;
                if(residual>0) while (j<k && nums[j] == nums[++j]);
                else if(residual<0) while (j<k && nums[k] == nums[--k]);
                else return target;
            }
        }
        return target - minResidual;
    }
}