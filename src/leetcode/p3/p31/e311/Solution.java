package leetcode.p3.p31.e311;

/**
 *
 * Created by Kunmiao Yang on 11/29/2017.
 */
public class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int m = A.length, n = B[0].length, c = B.length, cols[] = new int[n], colCount = 0, result[][] = new int[m][n];
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < c; i++) {
                if(0 != B[i][j]) {
                    cols[colCount++] = j;
                    break;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < c; j++) {
                if(0 != A[i][j]) {
                    for(int k = 0; k < colCount; k++) {
                        result[i][cols[k]] += A[i][j] * B[j][cols[k]];
                        System.out.println(i + "," + cols[k] + ":" + result[i][cols[k]]);
                    }
                }
            }
        }
        return result;
    }
}
