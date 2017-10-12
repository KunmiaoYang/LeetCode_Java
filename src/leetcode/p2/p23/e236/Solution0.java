package leetcode.p2.p23.e236;

import java.util.LinkedList;

/**
 *
 * Created by kunmiao.yang on 2017/6/30.
 */
public class Solution0 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> pPath = new LinkedList<>();
        nodePath(pPath, root, p);
        for(TreeNode res: pPath) if(searchNode(res, q)) return res;
        return null;
    }
    boolean nodePath(LinkedList<TreeNode> path, TreeNode root, TreeNode node) {
        if(null == root) return false;
        path.push(root);
        if(root.equals(node)|| nodePath(path, root.left, node) || nodePath(path, root.right, node)) return true;
        path.pop();
        return false;
    }
    boolean searchNode(TreeNode root, TreeNode node) {
        return null != root && (root.equals(node)|| searchNode(root.left, node) || searchNode(root.right, node));
    }
}