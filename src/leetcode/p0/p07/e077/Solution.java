package leetcode.p0.p07.e077;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/15.
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<>();
        if(k<1 || k>n) return res;
        else if(k==1) for(int i = 0; i<n;) res.add(new LinkedList<>(Collections.singletonList(++i)));
        else for(int i = n; i>=k; i--) {
            List<List<Integer>> subCombs = combine(i - 1, k - 1);
            for(List<Integer> subComb: subCombs) subComb.add(i);
            res.addAll(subCombs);
        }
        return res;
    }
}
