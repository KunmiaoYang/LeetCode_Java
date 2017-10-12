package leetcode.p0.p04.e046;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/26.
 */
public class Solution2 {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length, m;
        LinkedList<List<Integer>> res = new LinkedList<>();
        res.add(new ArrayList<>(n));
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) numSet.add(num);
        for(int i = 0; i<n; i++) {
            m = res.size();
            for (int j = 0; j<m; j++) {
                List<Integer> sub = res.pop();
                numSet.removeAll(sub);
                for(int num: numSet) {
                    ArrayList<Integer> permutation = new ArrayList<>(n);
                    permutation.addAll(sub);
                    permutation.add(num);
                    res.add(permutation);
                }
                numSet.addAll(sub);
            }
        }
        return res;
    }
}