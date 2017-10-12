package leetcode.p0.p08.e080;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Test {
    public static void test() {
        test(new int[]{});
        test(new int[]{1,1,1,1,1,1,2,2,2,3,3,3,3});
    }
    static void test(int[] nums) {
        int res;
        long startTime, endTime;
        System.out.println("Original nums: " + Arrays.toString(nums));
        startTime = System.currentTimeMillis();
        res = new Solution().removeDuplicates(nums);
        endTime = System.currentTimeMillis();
        System.out.print("Time span: " + (endTime - startTime) + "ms\t|\t");
        System.out.println("Length = " + res + "\tNums: " + Arrays.toString(Arrays.copyOf(nums, res)));
    }
}
