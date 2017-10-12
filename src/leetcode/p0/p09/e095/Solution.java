package leetcode.p0.p09.e095;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by admin on 2017/7/8.
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }
    private LinkedList<TreeNode> generateTrees(int beg, int end) {
        LinkedList<TreeNode> res = new LinkedList<>();
        if(beg == end) res.add(new TreeNode(beg));
        else if(beg < end) {
            LinkedList<TreeNode> leftList, rightList = generateTrees(beg + 1, end);
            for(TreeNode rightNode: rightList) {
                TreeNode midNode = new TreeNode(beg);
                midNode.right = rightNode;
                res.add(midNode);
            }
            for(int mid = beg + 1; mid < end; mid++) {
                leftList = generateTrees(beg, mid - 1);
                rightList = generateTrees(mid + 1, end);
                for(TreeNode rightNode: rightList) {
                    for(TreeNode leftNode: leftList) {
                        TreeNode midNode = new TreeNode(mid);
                        midNode.left = leftNode;
                        midNode.right = rightNode;
                        res.add(midNode);
                    }
                }
            }
            leftList = generateTrees(beg, end - 1);
            for(TreeNode leftNode: leftList) {
                TreeNode midNode = new TreeNode(end);
                midNode.left = leftNode;
                res.add(midNode);
            }
        }
        return res;
    }
}