package leetcode.p0.p04.e048;

/**
 * Created by kunmiao.yang on 2017/5/12.
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        for(int i = 0, k = matrix.length-1; i<k; i++, k--) {
            for(int j = 0, l = matrix.length-1; j<=l; j++, l--) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[l][i];
                matrix[l][i] = matrix[k][l];
                matrix[k][l] = matrix[j][k];
                matrix[j][k] = temp;
            }
        }
    }
}
