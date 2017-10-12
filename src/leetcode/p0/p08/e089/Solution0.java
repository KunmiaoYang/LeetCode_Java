package leetcode.p0.p08.e089;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by admin on 2017/6/25.
 */
public class Solution0 {
    public List<Integer> grayCode(int n) {
        int m = (int) Math.pow(2, n), top = 0, index = 0, bits[] = new int[n + 1], bitSeq[] = new int[m - 1];
        LinkedList<Integer> res = new LinkedList<>();
        bits[0] = 1;
        res.add(0);
        for(int i = 0; i < n; i++) {
            bitSeq[index++] = i;
            res.add(res.peekLast() ^ bits[i]);
            for(int j = 0; j < top; j++) {
                bitSeq[index++] = bitSeq[j];
                res.add(res.peekLast() ^ bits[bitSeq[j]]);
            }
            top = index;
            bits[i + 1] = bits[i] << 1;
        }
        return res;
    }
}