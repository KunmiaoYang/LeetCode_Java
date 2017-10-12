package leetcode.p0.p04.e047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/6.
 */
public class Solution0 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length, m = 1;
        for(int i = n; i>1; i--) m*=i;
        List<List<Integer>> res = new ArrayList<>(m);
        Integer[] permutation = new Integer[n];
        Arrays.sort(nums);
        for(int i = 0; i<n; i++) permutation[i] = nums[i];
        for(int i = 0; i<m; i++) {
            res.add(Arrays.asList(permutation.clone()));
            if(!nextPermutation(permutation)) break;
        }
        return res;
    }
    public boolean nextPermutation(Integer[] nums) {
        int left, right, n = nums.length;
        if(n<2) return false;
        for(left = n-2; left>-1 && nums[left]>=nums[left+1]; ) left--;
        if(left >  -1) {
            for(right = left+1; right<n-1 && nums[left]<nums[right+1]; ) right++;
            swap(nums, left, right);
        } else return false;
        for(left = left+1, right = n-1; left<right; left++, right--) swap(nums, left, right);
        return true;
    }
    public void swap(Integer[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}