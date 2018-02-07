package leetcode.p1.p12.e127;
import java.util.*;

/**
 *
 * Created by Kunmiao Yang on 10/17/2017.
 */
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList.isEmpty()) return -1;
        int listLength = wordList.size();
        int wordSize = wordList.get(0).length();
        Set<String> set = new HashSet<>(wordList), curSet = new HashSet<>();
        if(!set.contains(endWord)) return 0;
        set.remove(beginWord);
        curSet.add(beginWord);

        for(int i = 0; i < listLength; i++) {
            Set<String> nextSet = new HashSet<>();
            for(String str: curSet) {
                char[] chars = str.toCharArray();
                for(int j = 0; j < wordSize; j++) {
                    char c = chars[j];
                    for(int k = 1, l = (c - 'a' + 1)%26; k < 26; k++, l = (l + 1) % 26) {
                        chars[j] = (char) ('a' + l);
                        String strNew = new String(chars);
                        if(set.contains(strNew)) {
                            if(strNew.equals(endWord)) return i + 2;
                            nextSet.add(strNew);
                            set.remove(strNew);
                        }
                    }
                    chars[j] = c;
                }
            }
            curSet = nextSet;
        }
        return 0;
    }
}