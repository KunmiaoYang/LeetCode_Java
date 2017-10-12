package leetcode.p0.p06.e062;

/**
 *
 * Created by admin on 2017/6/18.
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        long numerator = 1, denominator = 1;
        int row = m + n - 2, col = Math.min(m, n) - 1;
        while (0 < col) {
            numerator*=(row--);
            denominator*=(col--);
        }
        return (int) (numerator/denominator);
    }
}