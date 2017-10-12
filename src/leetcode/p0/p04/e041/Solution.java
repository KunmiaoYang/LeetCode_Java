package leetcode.p0.p04.e041;

/**
 *
 * Created by kunmiao.yang on 2017/6/1.
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0, index; i<nums.length;) {
            index = nums[i]-1;
            if (index >= nums.length || index < 0 || index == i || nums[i] == nums[index]) i++;
            else swap(nums, i, index);
        }
        int i = 0;
        while (i<nums.length && nums[i] == 1+i) i++;
        return i+1;
    }
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}