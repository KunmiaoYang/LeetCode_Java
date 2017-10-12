package leetcode.p0.p09.e094;


import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Test {
    public static void test() {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(80); root.right = new TreeNode(30);
        root.left.right = new TreeNode(70);root.right.left = new TreeNode(40);
        root.left.right.right = new TreeNode(55);root.right.left.left = new TreeNode(45);

        test(root);
    }
    static void test(TreeNode root) {
        List<Integer> res;
        Util.traversPrint(root); System.out.println();
        long startTime=System.currentTimeMillis();
        res = new Solution().inorderTraversal(root);
        long endTime=System.currentTimeMillis();
        System.out.println("In order traversal is " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

    }
}
