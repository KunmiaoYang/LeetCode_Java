package leetcode.p0.p07.e073;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/5/16.
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isHeaderZero = false;
        int m = matrix.length, n = matrix[0].length;
        for(int val: matrix[0]) if(0 == val) isHeaderZero = true;
        for(int j = 1; j<m; j++) {
            boolean existZero = false;
            for(int i = 0; i<n; i++) {
                if(0 == matrix[j][i]) {
                    existZero = true;
                    matrix[0][i] = 0;
                }
            }
            if(existZero) Arrays.fill(matrix[j], 0);
        }
        for(int i = 0; i<n; i++) if(0 == matrix[0][i]) for(int j = 1; j<m; j++) matrix[j][i] = 0;
        if(isHeaderZero) Arrays.fill(matrix[0], 0);
    }
}