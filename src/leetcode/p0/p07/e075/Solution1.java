package leetcode.p0.p07.e075;

/**
 * Created by admin on 2017/5/13.
 */
public class Solution1 {
    public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length;
        for(int num: nums) {
            switch (num) {
                case 0: p0++; break;
                case 2: p2--; break;
            }
        }
        for(int i = 0; i<p0; i++) nums[i] = 0;
        for(int i = p0; i<p2; i++) nums[i] = 1;
        for(int i = p2; i<nums.length; i++) nums[i] = 2;
    }
}
