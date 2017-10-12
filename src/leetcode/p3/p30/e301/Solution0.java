package leetcode.p3.p30.e301;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by admin on 2017/7/4.
 */
public class Solution0 {
    char[] chars;
    int tail = 0, tailLen;
    public List<String> removeInvalidParentheses(String s) {
        chars = s.toCharArray();
        List<String> res = new LinkedList<>();
        List<List<char[]>> subStrings = new ArrayList<>(chars.length);
        int tail = 0, count = 0;
        for(int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(': count--; break;
                case ')': count++; break;
            }
            if(0 < count) {
                for (; i + 1 < chars.length && ')' == chars[i + 1]; i++) count++;
                List<char[]> stringList = new LinkedList<>();
                removeInvalidSubstring(stringList, tail, i + 1, new char[i - tail - count + 1], 0, count);
                subStrings.add(stringList);
                tail = i + 1;
                count = 0;
            }
        }
        int size = subStrings.size();
        tailLen = chars.length - tail;
        combine(res, subStrings, size, new char[size][], 0);
        return res;
    }
    void removeInvalidSubstring(List<char[]> stringList, int start, int end, char[] subChars, int pos, int count) {
        if(0 == count) {
            System.arraycopy(chars, start, subChars, pos, end - start);
            stringList.add(subChars.clone());
        } else {
            for(int i = start; i < end - count; i++) {
                if(')' == chars[i]) removeInvalidSubstring(stringList, i + 1, end, subChars, pos, count - 1);
                subChars[pos++] = chars[i];
            }
        }
    }
    void combine(List<String> res, List<List<char[]>> subStrings, int size, char[][] strings, int pos) {
        if(size == pos) {
            StringBuilder sb = new StringBuilder();
            for(char[] subChars: strings) sb.append(subChars);
            sb.append(chars, tail, tailLen);
            res.add(sb.toString());
        } else {
            List<char[]> list = subStrings.get(pos);
            for (char[] s : list) {
                strings[pos] = s;
                combine(res, subStrings, size, strings, pos + 1);
            }
        }
    }
}