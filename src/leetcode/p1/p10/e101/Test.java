package leetcode.p1.p10.e101;

/**
 *
 * Created by Kunmiao Yang on 10/13/2017.
 */
public class Test {
    public static void test() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(2);
        System.out.println("Result = " + new Solution().isSymmetric(root));
    }
}
