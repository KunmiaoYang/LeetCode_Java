package leetcode.p0.p07.e078;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Solution {
    int n;
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        List<List<Integer>> res = new ArrayList<>((int) Math.pow(2, n));
        subsets(res, new ArrayList<>(n), nums, 0);
        return res;
    }
    void subsets(List<List<Integer>> res, List<Integer> subset, int[] nums, int current) {
        if(current == n)
            res.add(new ArrayList<>(subset));
        else {
            subset.add(nums[current]);
            subsets(res, subset, nums, current + 1);
            subset.remove((Integer) nums[current]);
            subsets(res, subset, nums, current + 1);
        }
    }
}