package leetcode.p0.p08.e084;

import java.util.*;

/**
 *
 * Created by admin on 2017/6/18.
 */
public class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stackHeight = new ArrayDeque<>(heights.length),
                stackStart = new ArrayDeque<>(heights.length);
        int maxArea, i;
        for(i = 0, maxArea = 0; i < heights.length; i++) {
            int start  = i;
            while (!stackHeight.isEmpty() && stackHeight.peek() > heights[i]) {
                start = stackStart.pop();
                maxArea = Math.max(maxArea, stackHeight.pop() * (i - start));
            }
            stackHeight.push(heights[i]);
            stackStart.push(start);
        }
        while (!stackHeight.isEmpty()) maxArea = Math.max(maxArea, stackHeight.pop() * (i - stackStart.pop()));
        return maxArea;
    }
}