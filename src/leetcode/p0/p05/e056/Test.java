package leetcode.p0.p05.e056;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Test {
    public static void test() {
        List<Interval> inp, res;
        long startTime, endTime;
        Solution.class.getClassLoader();

        inp = new LinkedList<>();
        inp.add(new Interval(5, 6));
        inp.add(new Interval(4, 5));
        inp.add(new Interval(2, 3));
        inp.add(new Interval(0, 1));
        startTime = System.currentTimeMillis();
        res = new Solution().merge(inp);
        endTime = System.currentTimeMillis();
        System.out.print("result = ");
        for(Interval interval: res) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        inp = new LinkedList<>();
        inp.add(new Interval(1,3));
        inp.add(new Interval(2,6));
        inp.add(new Interval(8,10));
        inp.add(new Interval(15,18));
        startTime = System.currentTimeMillis();
        res = new Solution().merge(inp);
        endTime = System.currentTimeMillis();
        System.out.print("result = ");
        for(Interval interval: res) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
