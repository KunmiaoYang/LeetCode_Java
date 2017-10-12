package leetcode.p0.p04.e042;

/**
 *
 * Created by kunmiao.yang on 2017/6/1.
 */
public class Solution {
    public int trap(int[] height) {
        int n = height.length, left = 0, right = 1, sum = 0, peak;
        if(n<3) return 0;
        forward: while (right<n) {
            while (height[left] > height[right]) if(++right == n) break forward;
            for(int i = left+1; i < right; i++) sum += height[left]-height[i];
            left = right++;
        }
        if(left<n-2) {
            for (peak = left, left = n-2, right = n-1; peak < left;) {
                while (height[left] < height[right]) left--;
                for(int i = left+1; i < right; i++) sum += height[right]-height[i];
                right = left--;
            }
        }
        return sum;
    }
}