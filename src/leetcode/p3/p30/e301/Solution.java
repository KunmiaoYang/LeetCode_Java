package leetcode.p3.p30.e301;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by admin on 2017/7/4.
 */
public class Solution {
    char[] chars;
    int minRmCount;
    public List<String> removeInvalidParentheses(String s) {
        chars = s.toCharArray();
        minRmCount = chars.length;
        List<String> res = new LinkedList<>();
        removeInvalidParentheses(res, new char[chars.length], 0, 0, 0, 0);
        return res;
    }
    private void removeInvalidParentheses(List<String> res, char[] buff, int posBuff, int rmCount, int posChars, int level) {
        while (posChars != chars.length && 20 != (chars[posChars] >> 1)) buff[posBuff++] = chars[posChars++];
        if(posChars == chars.length) {
            if(0 == level) {
                if(minRmCount > rmCount) minRmCount = rmCount;
                res.add(String.copyValueOf(buff, 0, posBuff));
            }
        } else {
            int pCount;
            if('(' == chars[posChars]) {
                for (pCount = 0; posChars != chars.length && '(' == chars[posChars]; pCount++) buff[posBuff++] = chars[posChars++];
                for (int i = 0; i <= pCount && rmCount + i <= minRmCount; i++) removeInvalidParentheses(res, buff, posBuff - i, rmCount + i, posChars, level + pCount - i);
            } else {
                for (pCount = 0; pCount < level && posChars != chars.length && ')' == chars[posChars]; pCount++) buff[posBuff++] = chars[posChars++];
                for (; posChars != chars.length && ')' == chars[posChars]; posChars++) rmCount++;
                for (int i = 0; i <= pCount && rmCount + i <= minRmCount; i++) removeInvalidParentheses(res, buff, posBuff - i, rmCount + i, posChars, level - pCount + i);
            }
        }
    }
}