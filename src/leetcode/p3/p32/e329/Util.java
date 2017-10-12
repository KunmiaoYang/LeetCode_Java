package leetcode.p3.p32.e329;

import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Util {
    public static void printMatrix(List<String> matrix) {
        for(String row: matrix) {
            System.out.print("[");
            for(char val: row.toCharArray()) System.out.print("  " + val);
            System.out.println(" ]");
        }
    }
    public static void printMatrix(int[][] matrix) {
        for(int[] row: matrix) {
            System.out.print("[");
            for(int val: row) System.out.print("  " + val);
            System.out.println(" ]");
        }
    }
    public static char[][] createMatrix(String[] input) {
        char[][] matrix = new char[input.length][input[0].length()];
        for(int i = 0; i<input.length; i++) matrix[i] = input[i].toCharArray();
        return matrix;
    }
}
