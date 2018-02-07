package leetcode.p1.p10.e107;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 10/14/2017.
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> list = new ArrayList<>(n);
            for(int i = 0; i < n; i++) {
                TreeNode node = queue.pop();
                if(null == node) continue;
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            ((LinkedList<List<Integer>>)res).push(list);
        }
        return res;
    }
}