package leetcode.p0.p03.e034;

import java.util.Arrays;

/**
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Test {
    public static void test() {
        int[] input, res;
        long startTime, endTime;

        input = new int[]{4};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchRange(input, 4);
        endTime=System.currentTimeMillis();
        System.out.print("Result = ");
        System.out.println(Arrays.toString(res));
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new int[]{};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchRange(input, 4);
        endTime=System.currentTimeMillis();
        System.out.print("Result = ");
        System.out.println(Arrays.toString(res));
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new int[]{4, 4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchRange(input, 4);
        endTime=System.currentTimeMillis();
        System.out.print("Result = ");
        System.out.println(Arrays.toString(res));
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new int[]{0, 1, 1, 2, 4, 4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchRange(input, 4);
        endTime=System.currentTimeMillis();
        System.out.print("Result = ");
        System.out.println(Arrays.toString(res));
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new int[]{0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchRange(input, 4);
        endTime=System.currentTimeMillis();
        System.out.print("Result = ");
        System.out.println(Arrays.toString(res));
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
