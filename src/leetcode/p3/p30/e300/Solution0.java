package leetcode.p3.p30.e300;

/**
 *
 * Created by admin on 2017/6/25.
 */
public class Solution0 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, count[] = new int[n], top = 0, l, r;
        for(int i = 1; i < n; i++) {
            if(nums[top] < nums[i]) {
                for (l = 0, r = top; l < r; ) {
                    int mid = (l + r) / 2;
                    if (nums[i] > nums[mid]) r = mid;
                    else l = mid + 1;
                }
                for (int j = l + 1; j <= top; j++) count[l] = Math.max(count[l], count[j]);
                top = l;
                count[l]++;
                nums[l] = nums[i];
            } else {
                nums[++top] = nums[i];
                count[top] = 0;
            }
        }
        return count[top] + 1;
    }
}