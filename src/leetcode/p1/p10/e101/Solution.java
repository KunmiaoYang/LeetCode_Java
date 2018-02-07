package leetcode.p1.p10.e101;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * Created by Kunmiao Yang on 10/13/2017.
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(null == root) return true;
        Deque<TreeNode> qLeft = new LinkedList<>();
        Deque<TreeNode> qRight = new LinkedList<>();
        qLeft.push(root.left);
        qRight.push(root.right);
        while(true) {
            if(qLeft.isEmpty()) return qRight.isEmpty();
            else if(qRight.isEmpty()) return false;
            TreeNode leftNode = qLeft.pop(), rightNode = qRight.pop();
            if(null == leftNode) {
                if(null != rightNode) return false;
                continue;
            } else if(null == rightNode) return false;
            else if(leftNode.val != rightNode.val) return false;
            qLeft.push(leftNode.left);
            qLeft.push(leftNode.right);
            qRight.push(rightNode.right);
            qRight.push(rightNode.left);
        }
    }
}