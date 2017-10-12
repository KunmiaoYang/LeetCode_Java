package leetcode.p0.p05.e051;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution4 {
    int n;
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        int m = n*n;
        List<List<String>> res = new LinkedList<>();
        int[] valid = new int[m];
        for(int i = 0; i<m; i++) valid[i] = i;
        solveNQueens(res, new boolean[n][n], valid, m, 0);
        return res;
    }
    public void solveNQueens(List<List<String>> res, boolean[][] queens, int[] valid, int validLen, int count) {
        if(n == count) {
            List<String> solution = new ArrayList<>(n);
            for(boolean[] row: queens) {
                StringBuilder sb = new StringBuilder(n);
                for(boolean isQueen: row) {
                    if(isQueen) sb.append('Q');
                    else sb.append('.');
                }
                solution.add(sb.toString());
            }
            res.add(solution);
            return;
        }
        if(validLen<1) return;
        int[] newValid = new int[validLen];
        for (int k = 0; k < validLen; ) {
            int queen = valid[k++], i = queen/n, j = queen%n, sum = i + j, diff = i - j, newValidCount = 0;
            queens[i][j] = true;
            for(int k1 = k; k1 < validLen; k1++) {
                int i1 = valid[k1]/n, j1 = valid[k1]%n;
                if(i1 != i && j1 != j && i1 + j1 != sum && i1 - j1 != diff) newValid[newValidCount++] = valid[k1];
            }
            solveNQueens(res, queens, newValid, newValidCount, count + 1);
            queens[i][j] = false;
        }
    }
}