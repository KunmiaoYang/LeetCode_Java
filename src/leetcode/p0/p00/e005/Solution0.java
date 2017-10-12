package leetcode.p0.p00.e005;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * Created by kunmiao.yang on 2017/5/12.
 */
public class Solution0 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int len, beginIndex = 0, lenMax = 0;
        HashMap<Character, LinkedList<Integer>> charMap = new HashMap<>();
        for(int i=0; i<chars.length; i++) {
            LinkedList<Integer> indices = charMap.get(chars[i]);
            if(null == indices) {
                indices = new LinkedList<>();
                charMap.put(chars[i], indices);
            } else for(Integer index: indices) {
                boolean isPal = true;
                for(int j = index+1, k = i-1; j<k && isPal; j++, k--) if(chars[j]!=chars[k]) isPal = false;
                if (isPal) {
                    len = i - index;
                    if(len> lenMax) {
                        beginIndex = index;
                        lenMax = len;
                    }
                }
            }
            indices.add(i);
        }
        return s.substring(beginIndex, beginIndex+lenMax+1);
    }
}
