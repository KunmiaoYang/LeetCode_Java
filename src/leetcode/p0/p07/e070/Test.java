package leetcode.p0.p07.e070;

/**
 *
 * Created by admin on 2017/6/19.
 */
public class Test {
    public static void test() {
        test(0);
        test(1);
        test(2);
        test(3);
        test(4);
        test(5);
        test(6);
    }
    static void test(int n) {
        System.out.println("Stairs = " + n + ": Result = " + new Solution().climbStairs(n));
    }
}
