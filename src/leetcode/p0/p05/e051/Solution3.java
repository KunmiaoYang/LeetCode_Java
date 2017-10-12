package leetcode.p0.p05.e051;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution3 {
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
        LinkedList<Integer> newValid = new LinkedList<>();
        int sum = i + j, diff = i - j;
        for(Integer grid: valid) {
            int k = grid/n, l = grid%n;
            if(k != i && l != j && k + l != sum && k - l != diff) newValid.add(grid);
        }
        return newValid;
    }
}