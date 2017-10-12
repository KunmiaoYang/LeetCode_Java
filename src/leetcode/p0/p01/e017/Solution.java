package leetcode.p0.p01.e017;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 2017/5/18.
 */
public class Solution {
    static char[][] digitMap = {{' '}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'},
            {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public List<String> letterCombinations(String digits) {
        LinkedList<String> strings = new LinkedList<>(Collections.singletonList(""));
        for(char charDigit: digits.toCharArray()) {
            int digit = charDigit-'0';
            int n = strings.size();
            for (int i = 0; i<n; i++) {
                String str = strings.pop();
                for(char c: digitMap[digit]) strings.add(str + c);
            }

        }
        return strings;
    }
}