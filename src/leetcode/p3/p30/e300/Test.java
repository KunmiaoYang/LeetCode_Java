package leetcode.p3.p30.e300;

import java.util.Arrays;

/**
 *
 * Created by admin on 2017/6/25.
 */
public class Test {
    public static void test() {
        test(new int[]{1,2,3,4,100,1,2,5,6,1,2,3,4});
        test(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        test(new int[]{});
        test(new int[]{1});
    }
    static void test(int[] nums) {
        System.out.println("LIS in " + Arrays.toString(nums) + " = " + new Solution().lengthOfLIS(nums));
    }
}
