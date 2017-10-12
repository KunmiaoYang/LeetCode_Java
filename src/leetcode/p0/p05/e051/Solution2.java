package leetcode.p0.p05.e051;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution2 {
    int n;
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        List<List<String>> res = new LinkedList<>();
        solveNQueens(res, new boolean[n][n], new boolean[n+1][n][n], 0);
        return res;
    }
    public void solveNQueens(List<List<String>> res, boolean[][] queens, boolean[][][] invalid, int count) {
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
        }
        for (int i = 0; i < n; i++) for(int j = 0; j < n; j++) if(!invalid[count][i][j]) {
            queens[i][j] = true;
            invalid[count][i][j] = true;
            prune(invalid, i, j, count + 1);
            solveNQueens(res, queens, invalid, count + 1);
            queens[i][j] = false;
        }
    }
    public void prune(boolean[][][] invalid, int i, int j, int count) {
        boolean[][] newInvalid = invalid[count];
        for(int k = 0; k < n; k++) System.arraycopy(invalid[count - 1][k], 0, newInvalid[k], 0, n);
        for(int k = 0; k < n; k++) {
            newInvalid[k][j] = true;
            newInvalid[i][k] = true;
        }
        if(i < j) for(int k = 0, l = j - i; l < n; k++, l++) newInvalid[k][l] = true;
        else for(int k = i - j, l = 0; k < n; k++, l++) newInvalid[k][l] = true;
        if(i + j < n) for(int k = i + j, l = 0; k > -1; k--, l++) newInvalid[k][l] = true;
        else for(int k = n - 1, l = i + j - n + 1; l < n; k--, l++) newInvalid[k][l] = true;
    }
}