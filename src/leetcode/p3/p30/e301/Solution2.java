package leetcode.p3.p30.e301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by admin on 2017/7/4.
 */
public class Solution2 {
    char rm = ')', chars[];
    public List<String> removeInvalidParentheses(String s) {
        chars = s.toCharArray();
        List<String> res = new LinkedList<>();
        List<List<char[]>> subStrings = new ArrayList<>(chars.length);
        LinkedList<List<char[]>> rightSubStrings = new LinkedList<>();
        int left = 0, right = chars.length, count = 0;
        for(int i = 0; i < chars.length; i++) {
            count -= toInt(chars[i]);
            if(0 < count) {
                for (; i + 1 < chars.length && '(' != chars[i + 1]; i++) if(')' == chars[i + 1]) count++;
                List<char[]> stringList = new LinkedList<>();
                removeInvalidSubstring(stringList, new char[i - left + 1], 0, left, i + 1, count);
                subStrings.add(stringList);
                left = i + 1;
                count = 0;
            }
        }
        rm = '(';
        count = 0;
        for(int i = chars.length - 1; i >= left; i--) {
            count += toInt(chars[i]);
            if(0 < count) {
                for(; i > left && ')' != chars[i - 1]; i--) if('(' == chars[i - 1]) count++;
                List<char[]> stringList = new LinkedList<>();
                removeInvalidSubstring(stringList, new char[right - i], 0, i, right, count);
                rightSubStrings.push(stringList);
                right = i;
                count = 0;
            }
        }
        if(left < right) subStrings.add(new LinkedList<>(Arrays.asList(Arrays.copyOfRange(chars, left, right))));
        subStrings.addAll(rightSubStrings);
        int size = subStrings.size();
        combine(res, subStrings, size, new char[size][], 0);
        return res;
    }
    void removeInvalidSubstring(List<char[]> stringList, char[] buff, int posBuff, int posChars, int end, int count) {
        if(0 == count) {
            System.arraycopy(chars, posChars, buff, posBuff, end - posChars);
            stringList.add(Arrays.copyOf(buff, end - posChars + posBuff));
        } else if(posChars != end) {
            while (posChars < end && rm != chars[posChars]) buff[posBuff++] = chars[posChars++];
            int maxCount = 0;
            for (; posChars < end && rm == chars[posChars]; maxCount++) buff[posBuff++] = chars[posChars++];
            maxCount = Math.min(maxCount, count);
            for (int i = 0; i <= maxCount; i++) removeInvalidSubstring(stringList, buff, posBuff - i, posChars, end, count - i);
        }
    }
    void combine(List<String> res, List<List<char[]>> subStrings, int size, char[][] strings, int pos) {
        if(size == pos) {
            StringBuilder sb = new StringBuilder();
            for(char[] subChars: strings) sb.append(subChars);
            res.add(sb.toString());
        } else {
            List<char[]> list = subStrings.get(pos);
            for (char[] s : list) {
                strings[pos] = s;
                combine(res, subStrings, size, strings, pos + 1);
            }
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