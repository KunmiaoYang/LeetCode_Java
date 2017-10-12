package leetcode.p4.p48.e482;

/**
 *
 * Created by admin on 2017/6/4.
 */
public class Solution0 {
    public String licenseKeyFormatting(String S, int K) {
        int n = S.length();
        StringBuilder sb = new StringBuilder(n + n/K);
        for(int i = n-1, j = 0; i>-1; i--) {
            char c = S.charAt(i);
            if('-' == c) continue;
            if(c > 96) c -= 32;
            if((j++)%K == 0) sb.append('-');
            sb.append(c);
        }
        return sb.length() == 0? "": sb.deleteCharAt(0).reverse().toString();
    }
}