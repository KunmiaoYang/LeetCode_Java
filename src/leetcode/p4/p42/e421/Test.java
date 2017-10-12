package leetcode.p4.p42.e421;

import java.util.Arrays;

/**
 *
 * Created by Kunmiao Yang on 8/26/2017.
 */
public class Test {
    public static void test() {
        test(new int[]{3, 10, 5, 25, 2, 8});
        test(new int[]{-2147483647,0,-2147483647,2147483647});
    }

    static void test(int[] nums) {
        int res;
        long startTime, endTime;
        System.out.println(Arrays.toString(nums));
        startTime = System.currentTimeMillis();
        res = new Solution().findMaximumXOR(nums);
        endTime = System.currentTimeMillis();
        System.out.print("Result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
