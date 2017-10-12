package leetcode.p0.p06.e060;

/**
 *
 * Created by admin on 2017/6/15.
 */
public class Solution0 {
    static float[] factorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    public String getPermutation(int n, int k) {
        char[] permutation = new char[n];
        k %= factorial[n];
        if(0 == k) k = (int) factorial[n];
        for(int i = 0; i < n; i++) permutation[i] = (char) ('1' + i);
        for(int i = 0, j = n - 1; j > 0; i++, j--) {
            if(k > factorial[j]) {
                int relPos = (int) Math.ceil(k / factorial[j]) - 1, absPos = relPos + i;
                char temp = permutation[absPos];
                while (absPos > i) permutation[absPos] = permutation[--absPos];
                permutation[i] = temp;
                k -= factorial[j] * relPos;
            }
        }
        return new String(permutation);
    }
}
