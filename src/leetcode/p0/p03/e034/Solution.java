package leetcode.p0.p03.e034;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(null == nums || 0 == nums.length) return new int[]{-1, -1};
        int left = 0, right = nums.length-1, mid, boundLeft, boundRight;
        while (true) {
            if(left == right) return target == nums[left]? new int[]{left, left}: new int[]{-1, -1};
            mid = (left + right) / 2;
            if(target > nums[mid]) left = mid + 1;
            else if(target == nums[mid]) {
                boundLeft = mid;
                boundRight = mid;
                break;
            }
            else right = mid;
        }
        while (left < boundLeft) {
            mid = (left + boundLeft) / 2;
            if(target > nums[mid]) left = mid + 1;
            else boundLeft = mid;
        }
        while (boundRight < right) {
            mid = (boundRight + right) / 2;
            if(target < nums[mid + 1]) right = mid;
            else boundRight = mid + 1;
        }
        return new int[]{boundLeft, boundRight};
    }
}