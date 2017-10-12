package leetcode.p0.p05.e051;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution0 {
    int n;
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        int m = n*n;
        List<List<String>> res = new LinkedList<>();
        LinkedList<Integer> valid = new LinkedList<>();
        for(int i = 0; i<m; i++) valid.add(i);
        solveNQueens(res, new boolean[n][n], valid, 0);
        return res;
    }
    public void solveNQueens(List<List<String>> res, boolean[][] queens, LinkedList<Integer> valid, int count) {
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
        while (!valid.isEmpty()) {
            int queen = valid.pop(), i = queen/n, j = queen%n;
            queens[i][j] = true;
            solveNQueens(res, queens, prune(valid, i, j), count + 1);
            queens[i][j] = false;
        }
    }
    public LinkedList<Integer> prune(LinkedList<Integer> valid, int i, int j) {
        LinkedList<Integer> newValid = new LinkedList<>(valid);
        for(int k = 0; k<n; k++) {
            newValid.remove((Integer) (k * n + j));
            newValid.remove((Integer) (i * n + k));
        }
        if(i < j) for(int k = 0, l = j - i; l < n; k++, l++) newValid.remove((Integer) (k * n + l));
        else for(int k = i - j, l = 0; k < n; k++, l++) newValid.remove((Integer) (k * n + l));
        if(i + j < n) for(int k = i + j, l = 0; k > -1; k--, l++) newValid.remove((Integer) (k * n + l));
        else for(int k = n - 1, l = i + j - n + 1; l < n; k--, l++) newValid.remove((Integer) (k * n + l));
        return newValid;
    }
}