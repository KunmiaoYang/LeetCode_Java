package leetcode.p0.p09.e099;

/**
 *
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Solution {
    TreeNode miss1, miss2, prev;
    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        morris(root);
        int temp = miss1.val;
        miss1.val = miss2.val;
        miss2.val = temp;
    }
    public void morris(TreeNode root) {
        TreeNode node = root, prevLeft;
        outer: while (null != node) {
            if(null == node.left) {
                operation(node);
                node = node.right;
            } else {
                prevLeft = node.left;
                while (null != prevLeft.right) {
                    if(prevLeft.right.equals(node)) {
                        operation(node);
                        prevLeft.right = null;
                        node = node.right;
                        continue outer;
                    } else prevLeft = prevLeft.right;
                }
                prevLeft.right = node;
                node = node.left;
            }
        }
    }
    public void operation(TreeNode node) {
        if (prev.val > node.val) {
            miss2 = node;
            if (null == miss1) miss1 = prev;
            else return;
        }
        prev = node;
    }
}
