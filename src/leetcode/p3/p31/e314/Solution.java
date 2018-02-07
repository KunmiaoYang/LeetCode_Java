package leetcode.p3.p31.e314;

import java.util.*;

/**
 *
 * Created by Kunmiao Yang on 11/29/2017.
 */
public class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if(null == root) return new LinkedList<>();
        int range[] = measure(root), width = range[1] - range[0] + 1;
        List<Integer>[] result = new List[width];
        for(int i = 0; i < width; i++) result[i] = new LinkedList<>();
        Deque<TreeNode> qNode = new LinkedList<>();
        Deque<Integer> qPos = new LinkedList<>();
        qNode.push(root);
        qPos.push(-range[0]);
        while (!qPos.isEmpty()) {
            TreeNode node = qNode.pop();
            int pos = qPos.pop();
            result[pos].add(node.val);
            if(null != node.left) {
                qNode.add(node.left);
                qPos.add(pos - 1);
            }
            if(null != node.right) {
                qNode.add(node.right);
                qPos.add(pos + 1);
            }
        }

        return Arrays.asList(result);
    }
    private int[] measure(TreeNode root) {
        if(null == root) return new int[]{1, -1};
        int[] leftRange = measure(root.left), rightRange = measure(root.right);
        return new int[]{Math.min(leftRange[0] - 1, rightRange[0] + 1),
                Math.max(leftRange[1] - 1, rightRange[1] + 1)};
    }
}
