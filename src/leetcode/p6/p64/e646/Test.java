package leetcode.p6.p64.e646;

import java.util.Arrays;

/**
 *
 * Created by Kunmiao Yang on 8/27/2017.
 */
public class Test {
    public static void test() {
        test(new int[][]{{3,5}, {10,15}, {Integer.MIN_VALUE,-10}});
        test(new int[][]{{10, Integer.MAX_VALUE}, {-15, -10}, {-5, -3}});
        test(new int[][]{{1,2}, {2,3}, {3,4}});
        test(new int[][]{{1,2}, {2,3}, {3,4}});
    }

    static void test(int[][] pairs) {
        int res;
        long startTime, endTime;
        for(int[] pair: pairs) System.out.print(Arrays.toString(pair));
        System.out.println();
        startTime = System.currentTimeMillis();
        res = new Solution().findLongestChain(pairs);
        endTime = System.currentTimeMillis();
        System.out.print("Result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}