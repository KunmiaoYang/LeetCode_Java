package leetcode.p0.p01.e015;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 10/30/2017.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2;) {
            int int0 = nums[i];
            for(int left = i + 1, right = nums.length - 1; left < right;) {
                int sum = int0 + nums[left] + nums[right];
                if(sum > 0) while(left < right && nums[right--] == nums[right]);
                else if(sum < 0) while(left < right && nums[left++] == nums[left]);
                else {
                    Integer[] arr = {int0, nums[left], nums[right]};
                    res.add(Arrays.asList(arr));
                    while(left < right && nums[right--] == nums[right]);
                    while(left < right && nums[left++] == nums[left]);
                }
            }
            while(i < nums.length - 2 && nums[i++] == nums[i]);
        }
        return res;
    }
}
