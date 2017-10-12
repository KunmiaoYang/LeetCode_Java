package leetcode.p3.p39.e396;

/**
 *
 * Created by kunmiao.yang on 2017/6/29.
 */
public class Solution {
    public int maxRotateFunction(int[] A) {
        int n = A.length, f = 0, sum = 0, res;
        for(int i = 0; i < n; i++) {
            sum += A[i];
            f += i * A[i];
        }
        res = f;
        for(int i = n - 1; i > 0; i--) {
            f += sum - n * A[i];
            res = Math.max(res, f);
        }
        return res;
    }
}