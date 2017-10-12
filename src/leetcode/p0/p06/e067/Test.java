package leetcode.p0.p06.e067;

/**
 *
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Test {
    public static void test() {
        test("11111", "11111");
        test("", "");
        test("0", "0");
        test("10", "1");
    }
    static void test(String a, String b) {
        String res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().addBinary(a, b);
        endTime = System.currentTimeMillis();
        System.out.println(a + " + " + b + " = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
