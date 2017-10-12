package leetcode.p0.p08.e089;

/**
 *
 * Created by admin on 2017/6/25.
 */
public class Test {
    public static void test() {
        test(1);
        test(2);
        test(4);
    }
    static void test(int n) {
        System.out.println(n + " sequence Gray Code: " + new Solution().grayCode(n));
    }
}
