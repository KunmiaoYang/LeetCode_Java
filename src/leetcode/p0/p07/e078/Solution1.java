package leetcode.p0.p07.e078;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Solution1 {
    int n;
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        List<List<Integer>> res = new ArrayList<>((int) Math.pow(2, n));
        for(int i = 0; i < n + 1; i++) res.addAll(subsets(nums, 0, i));
        return res;
    }
    List<List<Integer>> subsets(int[] nums, int start, int count) {
        List<List<Integer>> res = new LinkedList<>();
        if(0 == count) {
            res.add(new LinkedList<>());
            return res;
        }
        for(int i = start; i < n - count + 1; i++) {
            List<List<Integer>> subsets = subsets(nums, i + 1, count - 1);
            for(List<Integer> subset: subsets) subset.add(nums[i]);
            res.addAll(subsets);
        }
        return res;
    }
}