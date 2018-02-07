package leetcode.p1.p12.e128;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Kunmiao Yang on 11/17/2017.
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        if(0 == nums.length) return 0;
        Map<Integer, Integer> left = new HashMap<>(), right = new HashMap<>();
        int max = 0, leftNum, rightNum;
        for(int num: nums) {
            if(left.containsKey(num) || right.containsKey(num)) continue;
            if(left.containsKey(num - 1)) {
                leftNum = left.get(num - 1);
                if(right.containsKey(num + 1)) {
                    rightNum = right.get(num + 1);
                    left.put(rightNum, leftNum);
                    right.put(leftNum, rightNum);
                    max = Math.max(max, rightNum - leftNum);
                } else {
                    left.put(num, leftNum);
                    right.put(leftNum, num);
                    max = Math.max(max, num - leftNum);
                }
            } else if(right.containsKey(num + 1)) {
                rightNum = right.get(num + 1);
                left.put(rightNum, num);
                right.put(num, rightNum);
                max = Math.max(max, rightNum - num);
            } else {
                left.put(num, num);
                right.put(num, num);
            }
        }
        return max + 1;
    }
}
