package leetcode.p0.p04.e046;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/26.
 */
public class Solution1 {
    int n;
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) numSet.add(num);
        return permute(numSet);
    }
    public List<List<Integer>> permute(Set<Integer> nums) {
        List<List<Integer>> res = new LinkedList<>();
        if(nums.isEmpty()) res.add(new ArrayList<>(n));
        else {
            Set<Integer> subNums = new HashSet<>(nums);
            for(int num: nums) {
                subNums.remove(num);
                List<List<Integer>> sub = permute(subNums);
                for(List<Integer> permutation: sub) permutation.add(num);
                res.addAll(sub);
                subNums.add(num);
            }
        }
        return res;
    }
}