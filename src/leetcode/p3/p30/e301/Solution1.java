package leetcode.p3.p30.e301;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by admin on 2017/7/4.
 */
public class Solution1 {
    char rm, chars[];
    String prefix, suffix;
    public List<String> removeInvalidParentheses(String s) {
        chars = s.toCharArray();
        List<String> res = new LinkedList<>();
        int left = 0, right = chars.length - 1, sum = 0, posPre, posSuf;
        char[] preChars = new char[chars.length], sufChars = new char[chars.length];
        for (posPre = 0; left < chars.length && '(' != chars[left]; left++) if(')' != chars[left]) preChars[posPre++] = chars[left];
        for (posSuf = chars.length; left < right && ')' != chars[right]; right--) if('(' != chars[right]) sufChars[--posSuf] = chars[right];
        prefix = String.valueOf(preChars, 0, posPre);
        suffix = String.valueOf(sufChars, posSuf, sufChars.length - posSuf);
        if(left >= right) {
            res.add(prefix + suffix);
            return res;
        }
        for(int i = left; i <= right; i++) sum += toInt(chars[i]);
        rm = sum > 0? '(': ')';
        prefix += '(';
        suffix = ')' + suffix;
        removeInvalidParentheses(res, new char[right - left], 0, left + 1, right, 1, sum > 0? sum: -sum);
        if(sum > 0) {
            int i = left + 1, j;
            while (i <= left + sum && '(' == chars[i]) i++;
            if(20 != (chars[i] >> 1)) {
                for(j = i + 1; j < right && 20 != (chars[j] >> 1); ) j++;
                if(')' != chars[j]) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    removeInvalidParentheses(res, new char[right - left], 0, i, right, 0, left - i + sum);
                }
            }
        } else if(sum < 0) {
            int i = right - 1, j;
            while (i >= right + sum && ')' == chars[i]) i--;
            if(20 != (chars[i] >> 1)) {
                for(j = i - 1; j > left && 20 != (chars[j] >> 1); ) j--;
                if('(' != chars[j]) {
                    suffix = suffix.substring(1, suffix.length());
                    removeInvalidParentheses(res, new char[right - left], 0, left + 1, i + 1, 1, i - right - sum);
                }
            }
        }
        return res;
    }
    private void removeInvalidParentheses(List<String> res, char[] buff, int posBuff, int posChars, int end, int sum, int count) {
        if(0 == count) res.add(prefix + String.valueOf(buff, 0, posBuff) + String.valueOf(chars, posChars, end - posChars) + suffix);
        else if(posChars != end) {
            for (; posChars < end && rm != chars[posChars]; sum += toInt(chars[posChars++])) buff[posBuff++] = chars[posChars];
            int maxCount = 0;
            for (; posChars < end && rm == chars[posChars]; maxCount++, sum += toInt(rm)) buff[posBuff++] = chars[posChars++];
            maxCount = Math.min(maxCount, count);
            for (int i = 0; i <= maxCount; i++, sum -= toInt(rm)) if(sum >= 0) removeInvalidParentheses(res, buff, posBuff - i, posChars, end, sum, count - i);
        }
    }
    private int toInt(char c) {
        switch (c) {
            case '(': return 1;
            case ')': return -1;
            default: return 0;
        }
    }
}