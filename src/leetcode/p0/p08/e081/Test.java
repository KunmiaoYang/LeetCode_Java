package leetcode.p0.p08.e081;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Test {
    public static void test() {
        test(new int[]{1,3,1,1,1}, 3);
        test(new int[]{1,1,1,3,1}, 3);
        test(new int[]{4, 5, 6, 7, 7, 7, 0, 0, 1, 2, 4}, 7);
        test(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        test(new int[]{4, 5, 6, 7, 0, 1, 2}, 5);
    }
    static void test(int[] nums, int target) {
        boolean res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().search(nums, target);
        endTime = System.currentTimeMillis();
        System.out.print("Time span: " + (endTime - startTime) + "ms\t|\t");
        System.out.print("Is target " + target + " exist in nums: " + Arrays.toString(nums));
        System.out.println("?\t" + res);
    }
}
