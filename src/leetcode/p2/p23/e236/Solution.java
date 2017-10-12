package leetcode.p2.p23.e236;

/**
 *
 * Created by kunmiao.yang on 2017/6/30.
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(null == root || root.equals(p) || root.equals(q)) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q),
                right = lowestCommonAncestor(root.right, p, q);
        if(null == left) return right;
        else if(null == right) return left;
        else return root;
    }
}