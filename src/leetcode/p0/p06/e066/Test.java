package leetcode.p0.p06.e066;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * Created by admin on 2017/6/19.
 */
public class Test {
    public static void test() {
        test(new int[]{9,9,9});
        test(new int[]{1,9,9});
        test(new int[]{1,9,8});
        test(new int[]{1,4,3,9,9,9,9,9,7,9});
        test(new int[]{});
        test(new int[]{0});
        test(new int[]{1,2,3,0});
    }
    static void test(int[] digits) {
        System.out.print("Digits = " + Arrays.toString(digits));
        System.out.println("\tResult = " + Arrays.toString(new Solution().plusOne(digits)));
    }
}
