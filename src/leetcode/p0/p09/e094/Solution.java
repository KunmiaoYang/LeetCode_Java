package leetcode.p0.p09.e094;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by admin on 2017/7/8.
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(null != root) inorderTraversal(res, root);
        return res;
    }
    private void inorderTraversal(List<Integer> res, TreeNode root) {
        if(null != root.left) inorderTraversal(res, root.left);
        res.add(root.val);
        if(null != root.right) inorderTraversal(res, root.right);
    }
}