package leetcode.p0.p03.e031;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Test {
    public static void test() {
        int arr[];
        long startTime, endTime;

        arr = new int[]{1, 2, 3, 3, 2, 2, 1};
        System.out.println(Arrays.toString(arr));
        startTime = System.currentTimeMillis();
        new Solution().nextPermutation(arr);
        endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{3, 3, 2, 2, 1};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        new Solution().nextPermutation(arr);
        endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        new Solution().nextPermutation(arr);
        endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{1, 1, 5};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        new Solution().nextPermutation(arr);
        endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        arr = new int[]{1,3,2};
        System.out.println(Arrays.toString(arr));
        startTime=System.currentTimeMillis();
        new Solution().nextPermutation(arr);
        endTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
