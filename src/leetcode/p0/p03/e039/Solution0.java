package leetcode.p0.p03.e039;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/5/31.
 */
public class Solution0 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum(candidates, target, 0);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target, int p) {
        List<List<Integer>> list = new LinkedList<>();
        for(int i = p; i<candidates.length; i++) {
            if(candidates[i] < target) {
                List<List<Integer>> subList = combinationSum(candidates, target - candidates[i], i);
                for(List<Integer> subCombination: subList) ((LinkedList<Integer>) subCombination).push(candidates[i]);
                list.addAll(subList);
            } else if(candidates[i] == target) {
                LinkedList<Integer> singleList = new LinkedList<>();
                singleList.add(target);
                list.add(singleList);
                break;
            } else break;
        }
        return list;
    }
}