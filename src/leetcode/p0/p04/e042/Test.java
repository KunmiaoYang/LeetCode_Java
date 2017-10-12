package leetcode.p0.p04.e042;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/1.
 */
public class Test {
    public static void test() {
        int res;
        long startTime, endTime;
        int[] arr;

        arr = new int[]{1,-10, 2};
        System.out.println(Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        res = new Solution().trap(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        res = new Solution().trap(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
