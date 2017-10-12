package leetcode.p0.p06.e065;

/**
 *
 * Created by kunmiao.yang on 2017/6/19.
 */
public class Test {
    public static void test() {
        test("-1");
        test("+1.");
        test("-1e-10");
        test("+.5");
        test("+0004.");
        test("0004.e+3.0");
        test("0004.e+4");
        test(".");
        test("1 ");
        test(" 0");
        test("e+");
        test(" ");
        test("e9");
        test("-e58");
        test("-");
    }
    static void test(String s) {
        boolean res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().isNumber(s);
        endTime = System.currentTimeMillis();
        System.out.println(s + ": " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
