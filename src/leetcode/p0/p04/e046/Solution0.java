package leetcode.p0.p04.e046;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/26.
 */
public class Solution0 {
    int n;
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        int step[] = new int[n];
        for(int i = n-1, j = 1, k = 1; i>-1; i--, j++, k*=j) step[i] = k;
        List<Integer> res[] = new List[step[0]];
        for(int i = 0; i<step[0]; i++) res[i] = new ArrayList<>(n);
        for(int i = 0; i<n; i++) {
            for (int j = 0; j<step[0]; j+=step[i]) {

            }
        }
        return Arrays.asList(res);
    }
    public List<List<Integer>> permute(Set<Integer> nums) {
        List<List<Integer>> res = new LinkedList<>();
        if(nums.isEmpty()) res.add(new ArrayList<>(n));
        else for(int num: nums) {
            nums.remove(num);
            List<List<Integer>> sub = permute(nums);
            for(List<Integer> permutation: sub) permutation.add(num);
            res.addAll(sub);
            nums.add(num);
        }
        return res;
    }
}