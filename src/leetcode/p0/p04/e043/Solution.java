package leetcode.p0.p04.e043;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Solution {
    public String multiply(String num1, String num2) {
        if(null == num1 || 0 == num1.length() || null == num2 || 0 == num2.length()) return "0";
        int n1 = num1.length(), n2 = num2.length(), maxDigit = 0;
        short[] revRes = new short[222], revNum1 = new short[n1], revNum2 = new short[n2 + 1];
        for(int i = n1-1, j = 0; i>-1; i--, j++) revNum1[j] = (short) (num1.charAt(i)-'0');
        for(int i = n2-1, j = 0; i>-1; i--, j++) revNum2[j] = (short) (num2.charAt(i)-'0');
        for(int i = 0; i<n1; i++) {
            int j, k;
            for(j = 0, k = i; j<n2+1; j++, k++) {
                revRes[k] += revNum1[i]*revNum2[j];
                revRes[k + 1] += revRes[k]/10;
                revRes[k] %= 10;
            }
            maxDigit = Math.max(maxDigit, k);
        }
        while (maxDigit>0 && 0 == revRes[maxDigit]) maxDigit--;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<maxDigit+1; i++) res.insert(0, (char)(revRes[i]+'0'));
        return res.toString();
    }
}