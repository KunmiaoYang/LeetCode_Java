package util;

/**
 *
 * Created by kunmiao.yang on 2017/5/12.
 */
public class Matrix {
    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[");
            for (int aRow : row) System.out.print(" " + aRow);
            System.out.println("]");
        }
    }
    public static void print(char[][] matrix) {
        for (char[] row : matrix) {
            System.out.print("[");
            for (char aRow : row) System.out.print(" " + aRow);
            System.out.println("]");
        }
    }
    public static char[][] createMatrix(String[] input) {
        char[][] matrix = new char[input.length][input[0].length()];
        for(int i = 0; i<input.length; i++) matrix[i] = input[i].toCharArray();
        return matrix;
    }
}
