package leetcode.p0.p05.e053;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Test {
    public static void test() {
        int[] arr;
        long startTime, endTime;
        int res;

        arr = new int[]{-1};
        System.out.println(Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        res = new Solution().maxSubArray(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        res = new Solution().maxSubArray(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{-100,-120,-1,-500};
        System.out.println(Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        res = new Solution().maxSubArray(arr);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
