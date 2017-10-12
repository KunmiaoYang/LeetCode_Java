package leetcode.p3.p39.e396;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/29.
 */
public class Test {
    public static void test() {
        test(new int[]{});
        test(new int[]{4});
        test(new int[]{4, 3, 2, 6});
    }
    static void test(int[] A) {
        System.out.println("Max of F(" + Arrays.toString(A) + ") is: " + new Solution().maxRotateFunction(A));
    }
}
