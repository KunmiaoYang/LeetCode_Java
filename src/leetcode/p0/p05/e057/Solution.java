package leetcode.p0.p05.e057;

import java.util.*;
/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<>(intervals.size() + 1);
        Interval interval = newInterval;
        Iterator<Interval> iterator = intervals.iterator();
        while (iterator.hasNext()) {
            interval = iterator.next();
            if(newInterval.start <= interval.end) {
                newInterval.start = Math.min(newInterval.start, interval.start);
                break;
            }
            res.add(interval);
        }
        res.add(newInterval);
        while (interval.end < newInterval.end) {
            if(iterator.hasNext()) interval = iterator.next();
            else return res;
        }
        if(newInterval.end < interval.start) res.add(interval);
        else newInterval.end = interval.end;
        while (iterator.hasNext()) res.add(iterator.next());
        return res;
    }
}