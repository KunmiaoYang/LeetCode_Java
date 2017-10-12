package leetcode.p0.p03.e039;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/5/31.
 */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new LinkedList<>();
        combinationSum(list, new LinkedList<>(), candidates, target, 0);
        return list;
    }
    public void combinationSum(List<List<Integer>> list, LinkedList<Integer> exist, int[] candidates, int target, int p) {
        for(int i = p; i<candidates.length; i++) {
            if(candidates[i] > target) break;
            exist.add(candidates[i]);
            if(candidates[i] < target) combinationSum(list, exist, candidates, target - candidates[i], i);
            else {
                list.add(new LinkedList<>(exist));
                exist.pollLast();
                break;
            }
            exist.pollLast();
        }
    }
}