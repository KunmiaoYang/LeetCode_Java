package leetcode.p0.p04.e040;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kunmiao.yang on 2017/5/31.
 */
public class Test {
    public static void test() {
        List<List<Integer>> res;
        long startTime, endTime;
        int[] arr;

        arr = new int[]{10, 1, 2, 7, 6, 1, 5};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        res = new Solution().combinationSum2(arr, 8);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{2, 4, 6, 8};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        res = new Solution().combinationSum2(arr, 8);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{2, 3, 5, 8};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        res = new Solution().combinationSum2(arr, 8);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
