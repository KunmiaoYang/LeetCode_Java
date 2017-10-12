package leetcode.p0.p08.e085;

import util.Matrix;

/**
 *
 * Created by kunmiao.yang on 2017/6/29.
 */
public class Test {
    public static void test() {
        test(new String[]{"11100"});
        test(new String[]{"11111111","11111110","11111110","11111000","01111000"});
        test(new String[]{""});
        test(new String[]{"10100","10110","11111","10010"});
        test(new String[]{"10100","10111","11111","10010"});
    }
    static void test(String[] strMatrix) {
        char[][] matrix = Matrix.createMatrix(strMatrix);
        int  res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().maximalRectangle(matrix);
        endTime = System.currentTimeMillis();
        System.out.println("Max square in matrix:");
        Matrix.print(matrix);
        System.out.print("is: " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
        System.out.println();
    }
}
