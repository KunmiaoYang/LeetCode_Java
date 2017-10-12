package leetcode.p0.p04.e047;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/6.
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length, m;
        List<List<Integer>> res = new LinkedList<>();
        res.add(new LinkedList<>());
        for (int i = 0; i<n; i++) {
            m = res.size();
            for(int j = 0; j<m; j++) {
                List<Integer> permutation = ((LinkedList<List<Integer>>) res).pop();
                Iterator<Integer> iterator = permutation.iterator();
                for(int k = 0; k<i+1; k++) {
                    if(iterator.hasNext() && iterator.next() == nums[i]) continue;
                    LinkedList<Integer> newPermutation = new LinkedList<>(permutation);
                    newPermutation.add(k, nums[i]);
                    res.add(newPermutation);
                }
            }
        }
        return res;
    }
}
