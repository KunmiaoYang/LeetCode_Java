package leetcode.p4.p48.e482;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * Created by admin on 2017/6/4.
 */
public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        int n = S.length(), k = n + n/K, m = k + 1;
        char[] chars = new char[m];
        for(int i = n-1, j = 0; i>-1; i--) {
            char c = S.charAt(i);
            if('-' == c) continue;
            if(c > 96) c -= 32;
            if((j++)%K == 0) chars[k--] = '-';
            chars[k--] = c;
        }
        return m-1 == k? "": new String(Arrays.copyOfRange(chars, k+1, m-1));
    }
}