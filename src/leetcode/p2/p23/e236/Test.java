package leetcode.p2.p23.e236;


/**
 *
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Test {
    public static void test() {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(80); root.right = new TreeNode(30);
        root.left.right = new TreeNode(40);root.right.left = new TreeNode(70);
        root.left.right.right = new TreeNode(45);root.right.left.left = new TreeNode(55);

        test(root, root.left.right, root.left.right.right);
    }
    static void test(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res;
        Util.traversPrint(root); System.out.println();
        long startTime=System.currentTimeMillis();
        res = new Solution().lowestCommonAncestor(root, p, q);
        long endTime=System.currentTimeMillis();
        System.out.println("LCA of " + p.val + " and " + q.val + " is " + res.val);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

    }
}
