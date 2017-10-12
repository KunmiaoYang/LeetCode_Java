package leetcode.p0.p05.e057;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Test {
    public static void test() {
        List<Interval> inp, res;
        Interval insert;
        long startTime, endTime;
        Solution.class.getClassLoader();

        inp = new LinkedList<>();
        inp.add(new Interval(1,5));
        insert = new Interval(6,8);
        for (Interval interval : inp) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println(" | [" + insert.start + ", " + insert.end + "]");
        startTime = System.currentTimeMillis();
        res = new Solution().insert(inp, insert);
        endTime = System.currentTimeMillis();
        System.out.print("result = ");
        for (Interval interval : res) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        inp = new LinkedList<>();
        inp.add(new Interval(1,3));
        inp.add(new Interval(6,9));
        insert = new Interval(2,5);
        for (Interval interval : inp) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println(" | [" + insert.start + ", " + insert.end + "]");
        startTime = System.currentTimeMillis();
        res = new Solution().insert(inp, insert);
        endTime = System.currentTimeMillis();
        System.out.print("result = ");
        for (Interval interval : res) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        inp = new LinkedList<>();
        inp.add(new Interval(1,2));
        inp.add(new Interval(3,5));
        inp.add(new Interval(6,7));
        inp.add(new Interval(8,10));
        inp.add(new Interval(12,16));
        insert = new Interval(4, 9);
        for (Interval interval : inp) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println(" | [" + insert.start + ", " + insert.end + "]");
        startTime = System.currentTimeMillis();
        res = new Solution().insert(inp, insert);
        endTime = System.currentTimeMillis();
        System.out.print("result = ");
        for (Interval interval : res) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        inp = new LinkedList<>();
        inp.add(new Interval(0, 1));
        inp.add(new Interval(4, 5));
        inp.add(new Interval(6, 7));
        insert = new Interval(2,3);
        for (Interval interval : inp) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println(" | [" + insert.start + ", " + insert.end + "]");
        startTime = System.currentTimeMillis();
        res = new Solution().insert(inp, insert);
        endTime = System.currentTimeMillis();
        System.out.print("result = ");
        for (Interval interval : res) System.out.print("\t[" + interval.start + ", " + interval.end + "]");
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
