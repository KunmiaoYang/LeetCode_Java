package leetcode.p3.p32.e329;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Test {
    public static void test() {
        int[][] input;
        int res;
        long startTime, endTime;

        input = new int[][]{{9,9,4},{6,6,8},{2,1,1}};
        Util.printMatrix(input);
        startTime = System.currentTimeMillis();
        res = new Solution().longestIncreasingPath(input);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new int[][]{{3,4,5},{3,2,6},{2,2,1}};
        Util.printMatrix(input);
        startTime = System.currentTimeMillis();
        res = new Solution().longestIncreasingPath(input);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
