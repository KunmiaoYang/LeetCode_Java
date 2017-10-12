package leetcode.p0.p08.e085;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * Created by kunmiao.yang on 2017/6/29.
 */
public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if(0 == m) return 0;
        int n = matrix[0].length, rowLen[][] = new int[m + 2][n];
        if(0 == n) return 0;
        for(int i = 0; i < m; i++) {
            rowLen[i + 1][n - 1] = matrix[i][n - 1] - '0';
            for(int j = n - 2; j > -1; j--) if('0' != matrix[i][j]) rowLen[i + 1][j] = rowLen[i + 1][j + 1] + matrix[i][j] - '0';
        }
        Deque<Integer> posStack = new ArrayDeque<>(m+1);
        int res = 0;
        for(int j = 0; j < n; j++) {
            posStack.push(0);
            for (int i = 1; i < m + 2; i++) {
                while (rowLen[posStack.peek()][j] > rowLen[i][j]) {
                    res = Math.max(res, rowLen[posStack.pop()][j] * (i - posStack.peek() - 1));
                }
                posStack.push(i);
            }
            posStack.clear();
        }
        return res;
    }
}