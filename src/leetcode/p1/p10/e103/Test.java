package leetcode.p1.p10.e103;

import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Test {
    public static void test() {
        List<List<Integer>> res;
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(80); root.right = new TreeNode(30);
        root.left.left = new TreeNode(20);root.left.right = new TreeNode(40);root.right.left = new TreeNode(70);root.right.right = new TreeNode(90);
        root.left.right.right = new TreeNode(45);root.right.left.left = new TreeNode(55);

        long startTime=System.currentTimeMillis();
        res = new Solution().zigzagLevelOrder(root);
        long endTime=System.currentTimeMillis();
        System.out.println(res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
