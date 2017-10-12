package leetcode.p0.p04.e040;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/31.
 */
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new LinkedList<>();
        combinationSum2(list, new LinkedList<>(), candidates, target, 0);
        return list;
    }
    public void combinationSum2(List<List<Integer>> list, LinkedList<Integer> exist, int[] candidates, int target, int p) {
        for(int i = p; i<candidates.length; i++) {
            if(candidates[i] > target) break;
            exist.add(candidates[i]);
            if(candidates[i] < target) {
                combinationSum2(list, exist, candidates, target - candidates[i], i + 1);
                while (i+1<candidates.length && candidates[i] == candidates[i+1]) i++;
                exist.pollLast();
            }
            else {
                list.add(new LinkedList<>(exist));
                exist.pollLast();
                break;
            }
        }
    }
}