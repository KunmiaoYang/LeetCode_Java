package leetcode.p0.p05.e056;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Solution0 {
    public List<Interval> merge(List<Interval> intervals) {
        LinkedList<Interval> res = new LinkedList<>(intervals);
        Collections.sort(res, (o1, o2) -> o1.start - o2.start);
        int n = res.size();
        if(1 < n) {
            Interval current = res.pop(), next;
            for (int i = 1; i < n; i++) {
                next = res.pop();
                if(next.start - current.end > 0) {
                    res.add(current);
                    current = next;
                } else {
                    current.end = Math.max(current.end, next.end);
                }
            }
            res.add(current);
        }
        return res;
    }
}
