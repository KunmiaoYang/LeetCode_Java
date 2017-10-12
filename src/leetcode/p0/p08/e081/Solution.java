package leetcode.p0.p08.e081;

/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        if(null == nums || 0 == nums.length) return false;
        return search(nums, 0, nums.length-1, target);
    }
    public boolean search(int[] nums, int left, int right, int target) {
        if(left == right) return target == nums[left];
        int mid = (left + right)/2;
        if(nums[mid] == target) return true;
        if(nums[left] == nums[right] && nums[mid] == nums[right])
            return search(nums, left, mid, target) || search(nums, mid + 1, right, target);
        if(nums[mid] < nums[left]) {
            if(nums[mid] < target && nums[right] >= target) return searchSorted(nums, mid + 1, right, target);
            else return search(nums, left, mid, target);
        } else {
            if(nums[mid] < target || nums[left] > target) return search(nums, mid + 1, right, target);
            else return searchSorted(nums, left, mid, target);
        }
    }
    public boolean searchSorted(int[] nums, int left, int right, int target) {
        if(left == right) return target == nums[left];
        int mid = (left + right) / 2;
        if(nums[mid] == target) return true;
        if(nums[mid] < target) return searchSorted(nums, mid + 1, right, target);
        else return searchSorted(nums, left, mid, target);
    }
}