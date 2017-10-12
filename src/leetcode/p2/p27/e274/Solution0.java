package leetcode.p2.p27.e274;

import java.util.Arrays;

/**
 * Created by admin on 2017/5/21.
 */
public class Solution0 {
    public int hIndex(int[] citations) {
        if(null == citations || 0 == citations.length) return 0;
        Arrays.sort(citations);
        int right = citations.length-1, count = 0;
        while (right>-1 && citations[right--]>count) count++;
        return count;
    }
}
