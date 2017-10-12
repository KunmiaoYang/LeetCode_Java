package algorithms.p1.p10.e102;

import java.util.*;
/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        if(null != root) deque.add(root);
        while (!deque.isEmpty()) {
            int n = deque.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < n; i++) {
                TreeNode node = deque.pop();
                list.add(node.val);
                if(null != node.left) deque.add(node.left);
                if(null != node.right) deque.add(node.right);
            }
            res.add(list);
        }
        return res;
    }
}