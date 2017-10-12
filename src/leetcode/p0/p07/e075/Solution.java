package leetcode.p0.p07.e075;

/**
 * Created by admin on 2017/5/13.
 */
public class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length-1, i = 0;
        while (i <= p2) {
            switch (nums[i]) {
                case 2:
                    nums[i] = nums[p2];
                    nums[p2--] = 2;
                    break;
                case 0:
                    nums[i] = nums[p0];
                    nums[p0++] = 0;
                default:
                    i++;
            }
        }
    }
}
