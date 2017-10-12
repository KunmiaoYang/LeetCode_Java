package leetcode.p3.p34.e347;

import java.util.*;
/**
 *
 * Created by kunmiao.yang on 2017/5/12.
 */
@SuppressWarnings("unchecked")
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        int largest = 0;
        List<Integer> res = new LinkedList<>();
        HashMap<Integer, Integer> freMap = new HashMap<>();
        HashSet<Integer>[] rankSet = new HashSet[nums.length+1];
        for(int num: nums) {
            Integer f = freMap.getOrDefault(num, 0) + 1;
            freMap.put(num, f);
        }
        for(int key: freMap.keySet()) {
            int f = freMap.get(key);
            if(f>largest) largest = f;
            if(null == rankSet[f]) rankSet[f] = new HashSet<>();
            rankSet[f].add(key);
        }
        for(int i = largest; i>0 && res.size()<k; i--) if(null!=rankSet[i]) res.addAll(rankSet[i]);
        return res;
    }
}