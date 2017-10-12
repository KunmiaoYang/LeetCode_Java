package leetcode.p0.p07.e074;

import util.Matrix;

/**
 *
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Test {
    public static void test() {
        test(new int[][]{{1, 2}}, 2);
        test(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 3);
        test(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 9);
    }
    static void test(int[][] matrix, int target) {
        boolean res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().searchMatrix(matrix, target);
        endTime = System.currentTimeMillis();
        Matrix.print(matrix);
        System.out.println("Is " + target + " exist? : " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
