package leetcode.p3.p32.e329;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Solution {
    int m, n, res = 0, matrix[][], maxMatrix[][];
    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;
        m = matrix.length;
        if(0 < m) {
            n = matrix[0].length;
            maxMatrix = new int[m][n];
            for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) if(0 == maxMatrix[i][j]) longestIncreasingPath(i, j);

            System.out.println("Max Matrix:");
            Util.printMatrix(maxMatrix);
        }
        return res;
    }
    int longestIncreasingPath(int i, int j) {
        if(maxMatrix[i][j] > 0) return maxMatrix[i][j];
        maxMatrix[i][j] = 1;
        if(0 < i && matrix[i - 1][j] > matrix[i][j]) maxMatrix[i][j] = Math.max(maxMatrix[i][j], longestIncreasingPath(i - 1, j) + 1);
        if(m - 1 > i && matrix[i + 1][j] > matrix[i][j]) maxMatrix[i][j] = Math.max(maxMatrix[i][j], longestIncreasingPath(i + 1, j) + 1);
        if(0 < j && matrix[i][j - 1] > matrix[i][j]) maxMatrix[i][j] = Math.max(maxMatrix[i][j], longestIncreasingPath(i, j - 1) + 1);
        if(n - 1 > j && matrix[i][j + 1] > matrix[i][j]) maxMatrix[i][j] = Math.max(maxMatrix[i][j], longestIncreasingPath(i, j + 1) + 1);
        res = Math.max(res, maxMatrix[i][j]);
        return maxMatrix[i][j];
    }
}