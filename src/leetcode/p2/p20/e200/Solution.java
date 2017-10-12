package leetcode.p2.p20.e200;

/**
 *
 * Created by kunmiao.yang on 2017/6/5.
 */
public class Solution {
    int m, n;
    public int numIslands(char[][] grid) {
        if(null == grid || 0 == grid.length) return 0;
        m = grid.length;
        n = grid[0].length;
        boolean[][] marker = new boolean[m][n];
        int count = 0;
        for(int i = 0; i<m; i++) for(int j = 0; j<n; j++) {
            if('0' == grid[i][j] || marker[i][j]) continue;
            count++;
            mark(grid, marker, i, j);
        }
        return count;
    }
    public void mark(char[][] grid, boolean[][] marker, int i, int j) {
        marker[i][j] = true;
        if('1' == grid[i][j]) {
            if (i > 0 && !marker[i - 1][j]) mark(grid, marker, i - 1, j);
            if (i < m - 1 && !marker[i + 1][j]) mark(grid, marker, i + 1, j);
            if (j > 0 && !marker[i][j - 1]) mark(grid, marker, i, j - 1);
            if (j < n - 1 && !marker[i][j + 1]) mark(grid, marker, i, j + 1);
        }
    }
}