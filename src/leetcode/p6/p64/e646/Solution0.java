package leetcode.p6.p64.e646;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 8/27/2017.
 */
class Solution0 {
    public int findLongestChain(int[][] pairs) {
        List<int[]> pairList = Arrays.asList(pairs);
        Collections.sort(pairList, (o1, o2) -> o1[0]-o2[0]);
        long minChainEnds[] = new long[1001];   // Among all the chains whose length is n, the minimum chain end is minChanEnds[n]
        minChainEnds[0] = Long.MIN_VALUE;
        Arrays.fill(minChainEnds, 1, 1001, Long.MAX_VALUE);
        int maxNum = 0;
        for(int[] pair: pairList) {
            for(int i = maxNum; i > -1; i--) {
                if(minChainEnds[i] < pair[0]) {
                    minChainEnds[i+1] = Math.min(minChainEnds[i+1], pair[1]);
                    maxNum = Math.max(maxNum, i+1);
                    break;
                }
            }
        }
        return maxNum;
    }
}