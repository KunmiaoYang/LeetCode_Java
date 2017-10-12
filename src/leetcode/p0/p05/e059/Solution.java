package leetcode.p0.p05.e059;

import java.util.*;

/**
 *
 * Created by admin on 2017/6/15.
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int up = -1, down = n, left = -1, right = n, val = 1, matrix[][] = new int[n][n];
        if(0 == n) return new int[0][0];
        while (true) {
            if(left + 1 == right) break;
            up++;
            for(int i = left + 1; i < right; i++) matrix[up][i] = val++;
            if(up + 1 == down) break;
            right--;
            for(int i = up + 1; i < down; i++) matrix[i][right] = val++;
            if(left + 1 == right) break;
            down--;
            for(int i = right - 1; i > left; i--) matrix[down][i] = val++;
            if(up + 1 == down) break;
            left++;
            for(int i = down - 1; i > up; i--) matrix[i][left] = val++;
        }
        return matrix;
    }
}
