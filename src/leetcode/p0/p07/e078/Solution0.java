package leetcode.p0.p07.e078;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/22.
 */
public class Solution0 {
    public List<List<Integer>> subsets(int[] nums) {
        int n = (int) Math.pow(2, nums.length);
        List<List<Integer>> res = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            List<Integer> subset = new ArrayList<>(nums.length);
            for(int j = 0, k = i; k > 0; j++, k >>= 1) if(1 == (k&1)) subset.add(nums[j]);
            res.add(subset);
        }
        return res;
    }
}