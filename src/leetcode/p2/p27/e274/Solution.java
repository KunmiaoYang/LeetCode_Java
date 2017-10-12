package leetcode.p2.p27.e274;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by admin on 2017/5/21.
 */
public class Solution {
    public int hIndex(int[] citations) {
        if(null == citations || 0 == citations.length) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(citations.length, (o1, o2) -> o2-o1);
        for(int i: citations) pq.add(i);
        int count = 0;
        try { while (pq.poll()>count) count++; }
        catch (NullPointerException e) {/*Swallow*/}
        return count;
    }
}
