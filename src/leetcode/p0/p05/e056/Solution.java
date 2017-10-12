package leetcode.p0.p05.e056;

import java.util.*;
/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        int n = intervals.size();
        List<Interval> res = new ArrayList<>(n);
        if(0 < n) {
            int i = 0, j, start[] = new int[n], end[] = new int[n];
            for(Interval interval: intervals) {
                start[i] = interval.start;
                end[i++] = interval.end;
            }
            Arrays.sort(start);
            Arrays.sort(end);
            for(i = 0, j = 1; j < n; j++) {
                if(start[j] > end[j-1]) {
                    res.add(new Interval(start[i], end[j-1]));
                    i = j;
                }
            }
            res.add(new Interval(start[i], end[n-1]));
        }
        return res;
    }
}
