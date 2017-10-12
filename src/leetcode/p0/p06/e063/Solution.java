package leetcode.p0.p06.e063;

import java.util.Arrays;

/**
 *
 * Created by admin on 2017/6/18.
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(0 == obstacleGrid.length) return 0;
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if(0 == n || 1 == obstacleGrid[0][0]) return 0;
        obstacleGrid[0][0] = 1;
        for(int i = 1; i < n; i++) {
            if(0 == obstacleGrid[0][i]) obstacleGrid[0][i] = obstacleGrid[0][i - 1];
            else {
                Arrays.fill(obstacleGrid[0],i, n, 0);
                break;
            }
        }
        for(int j = 1; j < m; j++) {
            if(0 == obstacleGrid[j][0]) obstacleGrid[j][0] = obstacleGrid[j - 1][0];
            else obstacleGrid[j][0] = 0;
            for(int i = 1; i < n; i++) {
                if(0 == obstacleGrid[j][i]) obstacleGrid[j][i] = obstacleGrid[j - 1][i] + obstacleGrid[j][i - 1];
                else obstacleGrid[j][i] = 0;
            }
        }
        return obstacleGrid[m - 1][n - 1];
    }
}