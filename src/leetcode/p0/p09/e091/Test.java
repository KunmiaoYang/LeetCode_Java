package leetcode.p0.p09.e091;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Test {
    public static void test() {
        test("1787897759966261825913315262377298132516969578441236833255596967132573482281598412163216914566534565");
        test("123");
        test("");
        test("12");
        test("1");
        test("0");
        test("30");
    }
    static void test(String s) {
        int res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().numDecodings(s);
        endTime = System.currentTimeMillis();
        System.out.println("s: \"" + s + "\"");
        System.out.print("Result: " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
