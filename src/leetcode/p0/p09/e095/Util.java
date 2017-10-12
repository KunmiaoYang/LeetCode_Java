package leetcode.p0.p09.e095;

/**
 *
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Util {
    public static void DFSPrint(TreeNode node) {
        if(null != node.left) DFSPrint(node.left);
        System.out.print(", " + node.val);
        if(null != node.right) DFSPrint(node.right);
    }
    public static void BFSPrint(TreeNode node) {
        System.out.print("[ " + node.val + ", ");
        if(null != node.left || null != node.right) {
            if (null != node.left) BFSPrint(node.left);
            else System.out.print("[], ");
            if (null != node.right) BFSPrint(node.right);
            else System.out.print("[], ");
        }
        System.out.print("]");
    }
}
