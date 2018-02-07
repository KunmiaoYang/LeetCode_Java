package leetcode.p1.p10.e103;

import java.util.*;

/**
 *
 * Created by Kunmiao Yang on 10/15/2017.
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        for(int i = 0; !q.isEmpty(); i = (i+1)%2) {
            int n = q.size();
            List<Integer> list = new ArrayList<>(n);
            Integer[] arr = new Integer[n];
            TreeNode node;
            if(0 == i) {
                for(int j = 0; j < n; j++) {
                    node = q.pop();
                    if(null != node.left) q.add(node.left);
                    if(null != node.right) q.add(node.right);
                    arr[j] = node.val;
                }
            } else {
                for(int j = n - 1; j >= 0; j--) {
                    node = q.pop();
                    if(null != node.left) q.add(node.left);
                    if(null != node.right) q.add(node.right);
                    arr[j] = node.val;
                }
            }
            res.add(Arrays.asList(arr));
        }
        return res;
    }
}