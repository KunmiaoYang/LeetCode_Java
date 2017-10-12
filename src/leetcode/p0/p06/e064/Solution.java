package leetcode.p0.p06.e064;

/**
 *
 * Created by admin on 2017/6/18.
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        if(0 == grid.length) return 0;
        int m = grid.length, n = grid[0].length;
        if(0 == n) return 0;
        for(int j = 1; j < n; j++) grid[0][j] += grid[0][j - 1];
        for(int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
            for(int j = 1; j < n; j++) grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
        }
        return grid[m - 1][n - 1];
    }
}