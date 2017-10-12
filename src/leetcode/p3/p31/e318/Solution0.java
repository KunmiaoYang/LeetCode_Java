package leetcode.p3.p31.e318;

/**
 *
 * Created by admin on 2017/7/3.
 */
public class Solution0 {
    public int maxProduct(String[] words) {
        boolean[] used = new boolean[128];
        int n = words.length, max = 0;
        for(int i = 0; i < n - 1; i++) {
            int len1 = words[i].length(), len2 = max / len1 + 1;
            for(char c: words[i].toCharArray()) used[c] = true;
            compare: for(int j = i + 1; j < n; j++) {
                int len3 = words[j].length();
                if(len3 < len2) continue;
                for(char c: words[j].toCharArray()) if(used[c]) continue compare;
                len2 = len3;
                max = len1 * len2;
            }
            for(char c: words[i].toCharArray()) used[c] = false;
        }
        return max;
    }
}