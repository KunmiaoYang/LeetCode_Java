package leetcode.p0.p06.e067;

/**
 *
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, k = Math.max(i, j) + 1, sum = 0;
        char[] res = new char[k + 1];
        boolean run = true;
        while (run) {
            run = false;
            if(i > -1) {
                run = true;
                sum += a.charAt(i--) - '0';
            }
            if(j > -1) {
                run = true;
                sum += b.charAt(j--) - '0';
            }
            res[k--] = (char) (sum%2 + '0');
            sum >>= 1;
        }
        for(k = 0; k < res.length - 1 && '0' == res[k]; ) k++;
        return new String(res, k, res.length - k);
    }
}