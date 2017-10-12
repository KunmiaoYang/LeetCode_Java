package leetcode.p0.p05.e051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution {
    int n;
    char[] charRow;
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        charRow = new char[n];
        Arrays.fill(charRow, '.');
        List<List<String>> res = new LinkedList<>();
        solveNQueens(res, new int[n], 0);
        return res;
    }
    public void solveNQueens(List<List<String>> res, int[] queens, int row) {
        if(n == row) {
            List<String> solution = new ArrayList<>(n);
            for(int col: queens) {
                charRow[col] = 'Q';
                solution.add(new String(charRow));
                charRow[col] = '.';
            }
            res.add(solution);
            return;
        }
        outer: for(int col = 0, sum = row, diff = row; col < n; col++, sum++, diff--) {
            for(int i = 0; i < row; i++) if(col == queens[i] || sum == i + queens[i] || diff == i - queens[i]) continue outer;
            queens[row] = col;
            solveNQueens(res, queens, row + 1);
        }
    }
}