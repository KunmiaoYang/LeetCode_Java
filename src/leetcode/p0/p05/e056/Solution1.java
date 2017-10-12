package leetcode.p0.p05.e056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Solution1 {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>(intervals);
        Collections.sort(res, (o1, o2) -> o1.start - o2.start);
        if(1 < res.size()) {
            int i = 1;
            Interval current = res.get(0), next;
            while (i < res.size()) {
                next = res.get(i);
                if(next.start - current.end > 0) {
                    current = next;
                    i++;
                } else {
                    current.end = Math.max(current.end, next.end);
                    res.remove(i);
                }
            }
        }
        return res;
    }
}
