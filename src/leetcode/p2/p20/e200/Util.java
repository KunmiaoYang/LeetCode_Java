package leetcode.p2.p20.e200;

/**
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Util {
    public static void printMatrix(char[][] matrix) {
        for(char[] row: matrix) {
            System.out.print("[");
            for(char val: row) {
                if('0' == val) System.out.print("   ");
                else System.out.print("  " + val);
            }
            System.out.println(" ]");
        }
    }
    public static char[][] createMatrix(String[] input) {
        char[][] matrix = new char[input.length][input[0].length()];
        for(int i = 0; i<input.length; i++) matrix[i] = input[i].toCharArray();
        return matrix;
    }
}
