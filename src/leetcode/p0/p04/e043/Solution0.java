package leetcode.p0.p04.e043;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Solution0 {
    public String multiply(String num1, String num2) {
        if(null == num1 || 0 == num1.length() || null == num2 || 0 == num2.length()) return "0";
        short n1 = (short) num1.length(), n2 = (short) num2.length(), maxDigit = 0;
        short[] revRes = new short[221], revMulti = new short[112], revNum1 = new short[n1], revNum2 = new short[n2 + 1];
        for(int i = n1-1, j = 0; i>-1; i--, j++) revNum1[j] = (short) (num1.charAt(i) - '0');
        for(int i = n2-1, j = 0; i>-1; i--, j++) revNum2[j] = (short) (num2.charAt(i) - '0');
        for(int i = 0; i<n1; i++) {
            int temp, j, k, l;
            for(temp = 0, j = 0; j<n2+1; j++) {
                temp += revNum1[i]*revNum2[j];
                revMulti[j] = (short) (temp%10);
                temp /= 10;
            }
            for(temp = 0, k = 0, l = i; k<j+1; k++, l++) {
                temp += revRes[l] + revMulti[k];
                revRes[l] = (short) (temp%10);
                temp /= 10;
            }
            maxDigit = (short) Math.max(maxDigit, l);
        }
        while (maxDigit>1 && 0 == revRes[maxDigit-1]) maxDigit--;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<maxDigit; i++) res.insert(0, (char)(revRes[i] + '0'));
        return res.toString();
    }
}