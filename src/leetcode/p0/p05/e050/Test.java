package leetcode.p0.p05.e050;

/**
 *
 * Created by kunmiao.yang on 2017/6/8.
 */
public class Test {
    public static void test() {
        long startTime, endTime;
        double res;

        startTime = System.currentTimeMillis();
        res = new Solution().myPow(8.88023, 3);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution().myPow(1, Integer.MIN_VALUE);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution().myPow(2, -3);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution().myPow(34.00515, -3);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
