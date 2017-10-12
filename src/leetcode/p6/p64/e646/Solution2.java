package leetcode.p6.p64.e646;

import java.util.Arrays;

/**
 *
 * Created by Kunmiao Yang on 8/27/2017.
 */
class Solution2 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (o1, o2) -> (o1[0] < o2[0]) ? -1 : 1);
        int maxChainStart = Integer.MAX_VALUE;
        int maxNum = 0;
        for(int i = pairs.length - 1; i > -1; i--) {
            if(pairs[i][1] < maxChainStart) {
                maxChainStart = pairs[i][0];
                maxNum++;
            }
        }
        return maxNum;
    }
}