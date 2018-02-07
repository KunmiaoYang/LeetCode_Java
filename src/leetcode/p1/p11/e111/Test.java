package leetcode.p1.p11.e111;

/**
 *
 * Created by Kunmiao Yang on 11/14/2017.
 */
public class Test {
    public static void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(new Solution().minDepth(root));
    }
}
