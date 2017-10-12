package leetcode.p0.p00.e003;

import java.util.HashMap;

/**
 *
 * Created by admin on 2017/5/10.
 */
public class LSWRC {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int i = 0, max = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(int j = 0; j<chars.length; j++) {
            Integer index = charMap.get(chars[j]);
            if(null!=index && index >= i) {
                max = Math.max(max, j - i);
                i = index + 1;
            }
            charMap.put(chars[j], j);
        }
        return Math.max(max, chars.length - i);
    }
}
