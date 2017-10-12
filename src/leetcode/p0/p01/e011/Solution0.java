package leetcode.p0.p01.e011;

/**
 *
 * Created by admin on 2017/5/17.
 */
public class Solution0 {
    public int maxArea(int[] height) {
        int n = height.length,
                left = 0, right = n-1, i,
                vol = (right - left) * Math.min(height[left], height[right]);
        while (left<right){
            if(height[left] < height[right]) {
                for(i = left + 1; i<right; i++) {
                    if(height[i] > height[left]) {
                        int volNew = (right - i) * Math.min(height[i], height[right]);
                        if(volNew > vol) {
                            left = i;
                            vol = volNew;
                        }
                        if(height[i] > height[right]) {
                            left = i;
                            break;
                        }
                    }
                }
                if(i==right && height[left] <= height[right]) break;
            } else {
                for(i = right - 1; i>left; i--) {
                    if(height[i] > height[right]) {
                        int volNew = (i - left) * Math.min(height[i], height[left]);
                        if(volNew > vol) {
                            right = i;
                            vol = volNew;
                        }
                        if(height[left] < height[i]) {
                            right = i;
                            break;
                        }
                    }
                }
                if(i==left && height[left] >= height[right]) break;
            }
        }
        return vol;
    }
}
