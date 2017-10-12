package leetcode.p0.p04.e041;

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

        arr = new int[]{3,4,-1,1};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        res = new Solution().firstMissingPositive(arr);
        endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{1,2,0};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        res = new Solution().firstMissingPositive(arr);
        endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{10, 1, 2, 7, 6, 1, 5};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        res = new Solution().firstMissingPositive(arr);
        endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
