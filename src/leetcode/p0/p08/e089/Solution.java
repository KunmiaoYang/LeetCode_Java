package leetcode.p0.p08.e089;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by admin on 2017/6/25.
 */
public class Solution {
    public List<Integer> grayCode(int n) {
        int m = (int) Math.pow(2, n), top = 0, index = 0, bitSeq[] = new int[m - 1];
        Integer res[] = new Integer[m];
        res[0] = 0;
        for(int i = 0, bitVal = 1; i < n; i++, bitVal <<= 1, top = index) {
            bitSeq[index++] = bitVal;
            res[index] = res[index - 1] ^ bitVal;
            for(int j = 0; j < top; j++) {
                bitSeq[index++] = bitSeq[j];
                res[index] = res[index - 1] ^ bitSeq[j];
            }
        }
        return Arrays.asList(res);
    }
}