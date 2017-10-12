package leetcode.p0.p00.e009;

/**
 * Created by kunmiao.yang on 2017/5/15.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int length = (int)Math.log10(x)+1,
                numImg = 0, i = 1;
        while(x>0 && i<length) {
            numImg = 10*numImg + x%10;
            x /= 10;
            i += 2;
        }
        if(length%2 > 0) x/=10;
        return numImg == x;
    }
}
