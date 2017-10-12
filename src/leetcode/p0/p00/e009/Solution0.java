package leetcode.p0.p00.e009;

/**
 * Created by kunmiao.yang on 2017/5/15.
 */
public class Solution0 {
    int num;
    boolean result = true;
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else num = x;
        int length = (int)( Math.log10(num)) + 1;
        if(length<2) return true;
        palindrome(length);
        return result;
    }

    public int palindrome(int index) {
        if(1==index) num /= 10;
        int digit = num % 10, digitImg;
        num /= 10;
        if(2 > index) return digit;
        digitImg = palindrome(index-2);
        if(!result ||  digitImg != digit) {
            result = false;
            return -1;
        }
        digit = num%10;
        num /= 10;
        return digit;
    }
}
