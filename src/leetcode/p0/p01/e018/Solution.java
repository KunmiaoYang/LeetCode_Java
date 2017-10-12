package leetcode.p0.p01.e018;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/19.
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length, left, right,threeTarget, twoTarget, residual, i = 0, max;
        List<List<Integer>> res = new LinkedList<>();
        if(n<4) return res;
        Arrays.sort(nums);
        max = nums[n-1];
        while (i < n - 3 && 4*nums[i] <= target) {
            threeTarget = target - nums[i];
            int j = i + 1;
            while (j < n - 2 && 3*nums[j] <= threeTarget) {
                twoTarget = threeTarget - nums[j];
                left = j + 1; right = n - 1;
                while (left < right) {
                    residual = twoTarget - nums[left] - nums[right];
                    if(0 < residual) while(left < right && nums[left] == nums[++left]);
                    else if(0 > residual) while (left < right && nums[right] == nums[--right]);
                    else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[++left]);
                        while (left < right && nums[right] == nums[--right]);
                    }
                }
                while (j < n - 2 && (nums[j] == nums[++j] || nums[j] + 2*max < threeTarget));
            }
            while (i < n - 3 && (nums[i] == nums[++i] || nums[i] + 3*max < target));
        }
        return res;
    }
}