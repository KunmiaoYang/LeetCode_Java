package leetcode.p0.p07.e077;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kunmiao.yang on 2017/5/15.
 */
public class Solution0 {
    public List<List<Integer>> combine(int n, int k) {
        if(k>n) return null;
        List<List<Integer>>  res = new LinkedList<>();
        Integer[] combination = new Integer[k+1];
        for(int i = 0; i<k;) combination[i++] = i;
        combination[k] = n+1;
        while (true) {
            res.add(Arrays.asList(Arrays.copyOf(combination, k)));
            if(combination[0] + k > n) break;
            for(int i = k-1; i>-1; i--) {
                if(combination[i] + 1 < combination[i+1]) {
                    combination[i]++;
                    for(int j = i+1; j<k; j++) combination[j] = combination[j-1]+1;
                    break;
                }
            }
        }
        return res;
    }
}
