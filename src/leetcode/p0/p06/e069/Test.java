package leetcode.p0.p06.e069;

/**
 *
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Test {
    public static void test() {
        test(Integer.MAX_VALUE);
        test(0);
        test(101);
        test(100);
        test(99);
    }
    static void test(int x) {
        int res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().mySqrt(x);
        endTime = System.currentTimeMillis();
        System.out.print("sqrt(" + x + ") = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
