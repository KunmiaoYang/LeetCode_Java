package leetcode.p3.p32.e325;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Kunmiao Yang on 11/28/2017.
 */
public class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int n = nums.length, sum = 0, maxLen = 0;
        Integer firstIndex;
        Map<Integer, Integer> firstMap = new HashMap<>();
        firstMap.put(0, -1);
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            if(!firstMap.containsKey(sum)) firstMap.put(sum, i);
            if(null != (firstIndex = firstMap.get(sum - k))) {
                maxLen = Math.max(maxLen, i - firstIndex);
            }
        }
        return maxLen;
    }
}
