package leetcode.p0.p09.e095;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by admin on 2017/7/8.
 */
public class Solution0 {
    List<TreeNode> res = new LinkedList<>();
    TreeNode root = new TreeNode(0);
    public List<TreeNode> generateTrees(int n) {
        generateTrees(root, 1, n, 1, n);
        return res;
    }
    private void generateTrees(TreeNode curr, int left, int right, int count, int n) {
        for(int i = left; i <= right; i++) {
            curr.val = i;
            if (left == i) curr.left = null;
            if (right == i) curr.right = null;
            if (left < i) {
                if(null == curr.left) curr.left = new TreeNode(0);
                generateTrees(curr.left, left, i - 1, count + 1, n);
            } else curr.left = null;
            if (i < right) {
                if(null == curr.right) curr.right = new TreeNode(0);
                generateTrees(curr.right, i + 1, right, count + i - left + 1, n);
            } else curr.right = null;
            if(count == n) res.add(copyTree(root));
        }
    }
    private TreeNode copyTree(TreeNode srcRoot) {
        if(null == srcRoot) return null;
        TreeNode tarRoot = new TreeNode(srcRoot.val);
        tarRoot.left = copyTree(srcRoot.left);
        tarRoot.right = copyTree(srcRoot.right);
        return tarRoot;
    }
}