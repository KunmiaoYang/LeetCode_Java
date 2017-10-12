package leetcode.p0.p00.e008;

/**
 * Created by kunmiao.yang on 2017/5/15.
 */
public class Solution {
    public int myAtoi(String str) {
        char[] chars = str.trim().toCharArray();
        if(chars.length<1) return 0;
        long res = 0;
        int i = 1;
        boolean isMinus = false;
        switch (chars[0]) {
            case '-': isMinus = true;
            case '+': break;
            default: i = 0;
        }
        while (i<chars.length && i<12 && chars[i]<='9'&& chars[i]>='0') {
            res = res*10 + chars[i++] - '0';
        }
        res = isMinus? -res: res;
        if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(res< Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) res;
    }
}
