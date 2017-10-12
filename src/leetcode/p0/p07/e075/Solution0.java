package leetcode.p0.p07.e075;

/**
 * Created by admin on 2017/5/13.
 */
public class Solution0 {
    public void sortColors(int[] nums) {
        int p0 = -1, p2 = nums.length, i = 0, j = nums.length-1, val;
        if(p2<2) return;
        while(true) {
            val = nums[i];
            if(val<1) {
                p0++;
                if(p0<=i) nums[p0] = 0;
            }
            else if(val>1) {
                p2--;
                if(p2>j) nums[p2] = 2;
            }
            if(p0>=i) nums[i] = 0;
            i++;
            if(i>j) break;

            val = nums[j];
            if(val<1) {
                p0++;
                if(p0<i) nums[p0] = 0;
            }
            else if(val>1) {
                p2--;
                if(p2>=j) nums[p2] = 2;
            }
            if(p2<=j) nums[j] = 2;
            j--;
            if(i>j) break;
        }
        for(i = p0 +1; i<p2; i++) nums[i] = 1;
    }
}
