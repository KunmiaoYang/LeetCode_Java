package leetcode.p3.p31.e318;

import java.util.Arrays;

/**
 *
 * Created by admin on 2017/7/3.
 */
public class Solution1 {
    public int maxProduct(String[] words) {
        boolean[] used = new boolean[128];
        int n = words.length, max = 0;
        Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());
        for(int i = 0; i < n - 1; i++) {
            int len1 = words[i].length(), len2 = max / len1 + 1;
            for(char c: words[i].toCharArray()) used[c] = true;
            compare: for(int j = i + 1; j < n; j++) {
                int len3 = words[j].length();
                if(len3 < len2) break;
                for(char c: words[j].toCharArray()) if(used[c]) continue compare;
                len2 = len3;
                max = len1 * len2;
                break;
            }
            for(char c: words[i].toCharArray()) used[c] = false;
        }
        return max;
    }
}