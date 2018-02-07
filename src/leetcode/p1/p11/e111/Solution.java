package leetcode.p1.p11.e111;

/**
 *
 * Created by Kunmiao Yang on 11/14/2017.
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(null == root) return 0;
        int left = minDepth(root.left), right = minDepth(root.right);
        if(0 == left && 0 == right) return 1;
        if(0 < left && 0 < right) return Math.min(left, right);
        return Math.max(left, right);
    }
}
