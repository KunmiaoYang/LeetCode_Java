package leetcode.p0.p03.e035;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Test {
    public static void test() {
        int input[], res;
        long startTime, endTime;

        input = new int[]{5,7};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchInsert(input, 4);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new int[]{1,2,3,5};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchInsert(input, 4);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchInsert(input, 4);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new int[]{};
        System.out.println(Arrays.toString(input));
        startTime=System.currentTimeMillis();
        res = new Solution().searchInsert(input, 4);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
