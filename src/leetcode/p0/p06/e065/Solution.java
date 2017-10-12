package leetcode.p0.p06.e065;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * Created by kunmiao.yang on 2017/6/19.
 */
public class Solution {
    public static final Set<Character> operators = new HashSet<>(Arrays.asList('+', '-'));
    public boolean isNumber(String s) {
        String str = s.trim();
        char[] chars = str.toCharArray();
        int posDot = str.indexOf('.'), posE = str.indexOf('e'), start = 0, end = chars.length;
        if(posE != -1) {
            int startE = posE + 1;
            if(startE == chars.length) return false;
            if(operators.contains(chars[startE])) startE++;
            if(startE == chars.length) return false;
            if(!checkNumber(chars, startE, chars.length)) return false;
            end = posE;
        }
        if(start == end) return false;
        if(operators.contains(chars[start])) start++;
        if(start == end) return false;
        if (posDot != -1) {
            if(start + 1 == end) return false;
            if (!checkNumber(chars, start, posDot)) return false;
            if (!checkNumber(chars, posDot + 1, end)) return false;
        } else if (!checkNumber(chars, start, end)) return false;
        return true;
    }
    boolean checkNumber(char[] chars, int start, int end) {
        for(int i = start; i < end; i++) if(chars[i] < '0' || chars[i] > '9') return false;
        return true;
    }
}