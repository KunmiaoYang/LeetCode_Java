package leetcode.p0.p09.e099;

/**
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Test {
    public static void test() {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(80); root.right = new TreeNode(30);
        root.left.right = new TreeNode(40);root.right.left = new TreeNode(70);
        root.left.right.right = new TreeNode(45);root.right.left.left = new TreeNode(55);

        Util.traversPrint(root); System.out.println();
        long startTime=System.currentTimeMillis();
        new Solution().recoverTree(root);
        long endTime=System.currentTimeMillis();
        Util.traversPrint(root); System.out.println();
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
