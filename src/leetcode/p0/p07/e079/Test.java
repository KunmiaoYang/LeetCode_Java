package leetcode.p0.p07.e079;

import util.Matrix;

/**
 *
 * Created by kunmiao.yang on 2017/6/19.
 */
public class Test {
    public static void test() {
        test(Matrix.createMatrix(new String[]{""}), "A");
        test(Matrix.createMatrix(new String[]{"ABCE", "SFCS", "ADEE"}), "ABCCED");
        test(Matrix.createMatrix(new String[]{"ABCE", "SFCS", "ADEE"}), "SEE");
        test(Matrix.createMatrix(new String[]{"ABCE", "SFCS", "ADEE"}), "ABCB");
    }

    static void test(char[][] board, String word) {
        boolean res;
        long startTime, endTime;
        Matrix.print(board);
        startTime = System.currentTimeMillis();
        res = new Solution().exist(board, word);
        endTime = System.currentTimeMillis();
        System.out.println("Search " + word + " = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
