package leetcode.p0.p04.e046;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kunmiao.yang on 2017/5/26.
 */
public class Solution3 {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length, m = 1;
        for(int i = n; i>1; i--) m*=i;
        List<Integer> res[] = new List[m];
        Integer[] permutation = new Integer[n];
        for(int i = 0; i<n; i++) permutation[i] = nums[i];
        for(int i = 0; i<m; i++) {
            res[i] = Arrays.asList(permutation.clone());
            nextPermutation(permutation);
        }
        return Arrays.asList(res);
    }
    public void nextPermutation(Integer[] nums) {
        int left, right, n = nums.length;
        if(n<2) return;
        for(left = n-2; left>-1 && nums[left]>=nums[left+1]; ) left--;
        if(left >  -1) {
            for(right = left+1; right<n-1 && nums[left]<nums[right+1]; ) right++;
            swap(nums, left, right);
        }
        for(left = left+1, right = n-1; left<right; left++, right--) swap(nums, left, right);
    }
    public void swap(Integer[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}