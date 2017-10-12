package leetcode.p0.p03.e033;

/**
 * Created by admin on 2017/5/26.
 */
public class Solution {
    public int search(int[] nums, int target) {
        if(null == nums || 0 == nums.length) return -1;
        return search(nums, 0, nums.length-1, target);
    }
    public int search(int[] nums, int left, int right, int target) {
        if(left == right) return target == nums[left]? left: -1;
//        if(nums[left] < nums[right]) return searchSorted(nums, left, right, target);
        int mid = (left + right)/2;
        if(nums[mid] < nums[left]) {
            if(nums[mid] < target && nums[right] >= target) return searchSorted(nums, mid + 1, right, target);
            else return search(nums, left, mid, target);
        } else {
            if(nums[mid] < target || nums[left] > target) return search(nums, mid + 1, right, target);
            else return searchSorted(nums, left, mid, target);
        }
    }
    public int searchSorted(int[] nums, int left, int right, int target) {
        if(left == right) return target == nums[left]? left: -1;
        int mid = (left + right) / 2;
        if(nums[mid] < target) return searchSorted(nums, mid + 1, right, target);
        else return searchSorted(nums, left, mid, target);
    }
}
