package leetcode.p0.p03.e035;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(null == nums || 0 == nums.length) return 0;
        int left = 0, right = nums.length - 1, mid;
        while (left<right) {
            mid = (left + right) / 2;
            if(nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return nums[left] < target? left + 1: left;
    }
}