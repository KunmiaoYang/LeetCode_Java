package leetcode.p0.p01.e011;

/**
 *
 * Created by admin on 2017/5/17.
 */
public class Solution {
    public int maxArea(int[] height) {
        int n = height.length, left = 0, right = n-1, low,
                vol = (right - left) * Math.min(height[left], height[right]);
        boolean isChance;
        low = Math.min(height[left], height[right]);
        while (left < right){
            if(height[left] < height[right]) isChance = low < height[++left];
            else isChance = low < height[--right];
            if(isChance) {
                int newLow = Math.min(height[left], height[right]);
                int newVol = (right - left) * newLow;
                if(newVol > vol) {
                    vol = newVol;
                    low = newLow;
                }
            }
        }
        return vol;
    }
}
