package leetcode.p0.p05.e059;

/**
 *
 * Created by admin on 2017/6/15.
 */
public class Util {
    public static void printMatrix(int[][] matrix) {
        for(int[] row: matrix) {
            System.out.print("[\t");
            for(int val: row) System.out.print(val + "\t");
            System.out.println("]");
        }
    }
}
