package leetcode.p0.p07.e074;

/**
 *
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n, left, right, mid, rowIndex;
        if(0 == m || 0 == matrix[0].length) return false;
        n = matrix[0].length;
        for (left = 0, right = m - 1; left < right; ) {
            mid = (left + right + 1) / 2;
            if(matrix[mid][0] == target) return true;
            if(matrix[mid][0] < target) left = mid;
            else right = mid - 1;
        }
        rowIndex = left;
        for (left = 0, right = n - 1; left < right; ) {
            mid = (left + right) / 2;
            if(matrix[rowIndex][mid] == target) return true;
            if(matrix[rowIndex][mid] < target) left = mid + 1;
            else right = mid;
        }
        return matrix[rowIndex][left] == target;
    }
}