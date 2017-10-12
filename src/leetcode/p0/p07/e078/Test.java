package leetcode.p0.p07.e078;

import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Test {
    public static void test() {
        test(new int[]{});
        test(new int[]{1,2,3});
    }
    static void test(int[] nums) {
        List<List<Integer>> res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().subsets(nums);
        endTime = System.currentTimeMillis();
        System.out.print("Time span: " + (endTime - startTime) + "ms\t|\t");
        System.out.println("Sub sets : " + res);
    }
}
