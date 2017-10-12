package leetcode.p3.p32.e327;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/19.
 */
public class Test {
    public static void test() {
        test(new int[]{-2147483647,0,-2147483647,2147483647}, -564, 3864);
        test(new int[]{-2, 5, -1}, -2, 5);
        test(new int[]{}, -2, 2);
        test(new int[]{-2, 5, -1}, -2, 2);
    }

    static void test(int[] nums, int lower, int upper) {
        int res;
        long startTime, endTime;
        System.out.println(Arrays.toString(nums));
        System.out.println("[ " + lower + ", " + upper + " ]");
        startTime = System.currentTimeMillis();
        res = new Solution().countRangeSum(nums, lower, upper);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
