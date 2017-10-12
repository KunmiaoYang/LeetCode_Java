package leetcode.p0.p03.e034;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Solution0 {
    public int[] searchRange(int[] nums, int target) {
        if(null == nums || 0 == nums.length) return new int[]{-1, -1};
        return searchRange(nums, 0, nums.length-1, target);
    }
    public int[] searchRange(int[] nums, int left, int right, int target) {
        if(left == right) return target == nums[left]? new int[]{left, left}: new int[]{-1, -1};
        int mid = (left + right) / 2;
        if(target > nums[mid]) return searchRange(nums, mid + 1, right, target);
        else if(target == nums[mid]) return new int[]{searchLeftBound(nums, left, mid, target), searchRightBound(nums, mid, right, target)};
        else return searchRange(nums, left, mid, target);
    }
    public int searchLeftBound(int[] nums, int left, int right, int target) {
        if(left == right) return left;
        int mid = (left + right) / 2;
        if(target > nums[mid]) return searchLeftBound(nums, mid + 1, right, target);
        else return searchLeftBound(nums, left, mid, target);
    }
    public int searchRightBound(int[] nums, int left, int right, int target) {
        if(left == right) return left;
        int mid = (left + right) / 2;
        if(target < nums[mid + 1]) return searchRightBound(nums, left, mid, target);
        else return searchRightBound(nums, mid + 1, right, target);
    }
}