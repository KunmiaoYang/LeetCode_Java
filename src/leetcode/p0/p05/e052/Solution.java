package leetcode.p0.p05.e052;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution {
    int n;
    public int totalNQueens(int n) {
        this.n = n;
        return totalNQueens(new int[n], new int[n], new int[n], 0);
    }
    public int totalNQueens(int[] queens, int[] ocpDiagSum, int[] ocpDiagDiff, int row) {
        if(n == row) return 1;
        int count = 0;
        outer: for(int col = 0, sum = row, diff = row; col < n; col++, sum++, diff--) {
            for(int i = 0; i < row; i++) if(col == queens[i] || sum == ocpDiagSum[i] || diff == ocpDiagDiff[i]) continue outer;
            queens[row] = col;
            ocpDiagSum[row] = sum;
            ocpDiagDiff[row] = diff;
            count += totalNQueens(queens, ocpDiagSum, ocpDiagDiff, row + 1);
        }
        return count;
    }
}
