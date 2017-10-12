package leetcode.p0.p04.e046;

import java.util.*;
/**
 *
 * Created by kunmiao.yang on 2017/5/26.
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        LinkedList<List<Integer>> res = new LinkedList<>();
        res.add(new LinkedList<>());
        for (int num : nums) {
            int m = res.size();
            for (int j = 0; j < m; j++) {
                List<Integer> permutation = res.pop();
                for (int k = 0; k < permutation.size()+1; k++) {
                    LinkedList<Integer> newPermutation = new LinkedList<>(permutation);
                    newPermutation.add(k, num);
                    res.add(newPermutation);
                }
            }
        }
        return res;
    }
}