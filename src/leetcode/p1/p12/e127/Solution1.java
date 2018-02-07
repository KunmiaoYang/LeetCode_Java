package leetcode.p1.p12.e127;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Kunmiao Yang on 10/17/2017.
 */
class Solution1 {
    int wordSize;
    int listLength;
    int minDepth;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList.isEmpty()) return -1;
        listLength = wordList.size();
        minDepth = listLength + 2;
        wordSize = wordList.get(0).length();
        Map<String, Integer> map = new HashMap<>();
        for(String word: wordList) map.put(word, -1);
        if(null == map.get(endWord)) return 0;
        map.put(beginWord, -2);
        map.put(endWord, 1);
        return dfs(beginWord, endWord, map, 0);
    }
    private int dfs(String beginWord, String endWord, Map<String, Integer> map, int depth) {
        depth++;
        if(depth < minDepth) {
            char[] chars = beginWord.toCharArray();
            int beginPath = listLength + 2;
            for(int i = 0; i < wordSize; i++) {
                char c = chars[i];
                for(int j = 1, k = c - 'a' + 1; j < 26; j++, k = (k + 1) % 26) {
                    chars[i] = (char) ('a' + k);
                    String str = new String(chars);

                    int minPath = map.getOrDefault(str, -2);
                    if(minPath == -1) {
                        map.put(str, -2);
                        minPath = dfs(str, endWord, map, depth);
                        map.put(str, minPath);
                    }
                    if(minPath > 0) {
                        beginPath = minPath;
                        if(minPath + depth < minDepth)
                            minDepth = minPath + depth;
                    }

                }
                chars[i] = c;
            }
            if(beginPath < listLength + 2) return beginPath + 1;
        }
        return 0;
    }
}