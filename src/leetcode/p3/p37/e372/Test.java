package leetcode.p3.p37.e372;

/**
 * Created by admin on 2017/5/30.
 */
public class Test {
    public static void test() {
        System.out.println("result = " + new Solution().superPow(2, new int[]{}));
        System.out.println("result = " + new Solution().superPow(2147483647, new int[]{2, 0, 0}));
        System.out.println("result = " + new Solution().superPow(2, new int[]{0, 3}));
        System.out.println("result = " + new Solution().superPow(2, new int[]{0, 0}));
    }
}
