package leetcode.p0.p04.e049;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/6/8.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Map<Character, Integer>, List<String>> anagramMap = new HashMap<>();
        for(String str: strs) {
            Map<Character, Integer> key = new HashMap<>();
            for(char c: str.toCharArray()) key.put(c, key.getOrDefault(c, 0) + 1);
            List<String> group = anagramMap.get(key);
            if(null == group) {
                group = new LinkedList<>();
                anagramMap.put(key, group);
            }
            group.add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}