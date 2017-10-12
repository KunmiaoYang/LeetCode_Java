package leetcode.p0.p05.e054;

import util.Matrix;

import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/12.
 */
public class Test {
    public static void test() {
        int[][] matrix;
        long startTime, endTime;
        List<Integer> res;

        matrix = new int[][]{{}};
        Matrix.print(matrix);
        startTime = System.currentTimeMillis();
        res = new Solution().spiralOrder(matrix);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        matrix = new int[][]{ { 1, 2, 3 },  { 4, 5, 6 }};
        Matrix.print(matrix);
        startTime = System.currentTimeMillis();
        res = new Solution().spiralOrder(matrix);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        matrix = new int[][]{ { 1, 2, 3 },  { 4, 5, 6 },  { 7, 8, 9 } };
        Matrix.print(matrix);
        startTime = System.currentTimeMillis();
        res = new Solution().spiralOrder(matrix);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
