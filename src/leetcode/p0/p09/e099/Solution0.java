package leetcode.p0.p09.e099;

/**
 *
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Solution0 {
    TreeNode miss1, miss2, prev;
    boolean isFinished = false;
    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        scan(root);
        int temp = miss1.val;
        miss1.val = miss2.val;
        miss2.val = temp;
    }
    public void scan(TreeNode node) {
        if(null != node.left) scan(node.left);
        if(isFinished) return;
        if (prev.val > node.val) {
            miss2 = node;
            if (null == miss1) miss1 = prev;
            else {
                isFinished = true;
                return;
            }
        }
        prev = node;
        if(null != node.right) scan(node.right);
    }
}
