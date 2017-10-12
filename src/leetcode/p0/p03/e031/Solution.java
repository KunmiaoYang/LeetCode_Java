package leetcode.p0.p03.e031;

/**
 *
 * Created by admin on 2017/6/15.
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        int left, right, n = nums.length;
        if(n<2) return;
        for(left = n-2; left>-1 && nums[left]>=nums[left+1]; ) left--;
        if(left >  -1) {
            for(right = left+1; right<n-1 && nums[left]<nums[right+1]; ) right++;
            swap(nums, left, right);
        }
        for(left = left+1, right = n-1; left<right; left++, right--) swap(nums, left, right);
    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}