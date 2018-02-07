package leetcode.p1.p12.e127;
import java.util.*;

/**
 *
 * Created by Kunmiao Yang on 10/17/2017.
 */
public class Solution0 {
    int wordSize;
    int minLength;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList.isEmpty()) return -1;
        minLength = wordList.size() + 1;
        wordSize = wordList.get(0).length();
        Map<String, Boolean> map = new HashMap<>();
        for(String word: wordList) map.put(word, true);
        dfs(beginWord, endWord, map, 0);
        return minLength <= wordList.size() ? minLength : 0;
    }
    private void dfs(String beginWord, String endWord, Map<String, Boolean> map, int length) {
        length++;
        if(beginWord.equals(endWord)) minLength = length;
        else if(length < minLength - 1) {
            char[] chars = beginWord.toCharArray();
            for(int i = 0; i < wordSize; i++) {
                char c = chars[i];
                for(int j = 1, k = c - 'a' + 1; j < 26; j++, k = (k + 1) % 26) {
                    chars[i] = (char) ('a' + k);
                    String str = new String(chars);
                    if(map.getOrDefault(str, false)) {
                        map.put(str, false);
                        dfs(str, endWord, map, length);
                        map.put(str, true);
                    }
                }
                chars[i] = c;
            }
        }
    }
}
