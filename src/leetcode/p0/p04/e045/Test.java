package leetcode.p0.p04.e045;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/6.
 */
public class Test {
    public static void test() {
        int res, inp[];
        long startTime, endTime;

        inp = new int[]{4,4,3,2,1,1,1};
        startTime = System.currentTimeMillis();
        res = new Solution().jump(inp);
        endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(inp));
        System.out.print("result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        inp = new int[]{2,3,1,1,4};
        startTime = System.currentTimeMillis();
        res = new Solution().jump(inp);
        endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(inp));
        System.out.print("result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        inp = new int[]{2};
        startTime = System.currentTimeMillis();
        res = new Solution().jump(inp);
        endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(inp));
        System.out.print("result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
