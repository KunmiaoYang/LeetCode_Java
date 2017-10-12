package leetcode.p3.p31.e318;

/**
 *
 * Created by admin on 2017/7/3.
 */
public class Solution {
    public int maxProduct(String[] words) {
        int n = words.length, max = 0, fingerPrint[] = new int[n];
        for(int i = 0; i < n; i++) for(char c: words[i].toCharArray()) fingerPrint[i] |= (1 << (c - 'a'));
        for(int i = 0; i < n - 1; i++) {
            int len1 = words[i].length(), len2 = max / len1 + 1;
            for(int j = i + 1; j < n; j++) {
                int len3 = words[j].length();
                if(len3 < len2 || (fingerPrint[i] & fingerPrint[j]) > 0) continue;
                len2 = len3;
                max = len1 * len2;
            }
        }
        return max;
    }
}