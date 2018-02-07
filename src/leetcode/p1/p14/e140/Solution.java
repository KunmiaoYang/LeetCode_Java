package leetcode.p1.p14.e140;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Kunmiao Yang on 11/22/2017.
 */
public class Solution {
    Map<String, List<String>> map = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        if(map.containsKey(s)) return map.get(s);
        List<String> res = new LinkedList<>();
        for(String word: wordDict) {
            if(s.equals(word)) {
                res.add(word);
            } else if(s.startsWith(word)) {
                List<String> subList = wordBreak(s.substring(word.length()), wordDict);
                for(String suffix: subList) res.add(word + " " + suffix);
            }
        }
        map.put(s, res);
        return res;
    }
}
