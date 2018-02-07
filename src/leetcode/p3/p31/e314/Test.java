package leetcode.p3.p31.e314;

/**
 *
 * Created by Kunmiao Yang on 11/29/2017.
 */
public class Test {
    public static void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
        root.left.right.right = new TreeNode(2);
        root.right.left.left = new TreeNode(5);

        System.out.println(new Solution().verticalOrder(root));
    }
}
