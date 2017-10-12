package leetcode.p0.p04.e049;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/6/8.
 */
public class Solution0 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for(String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
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