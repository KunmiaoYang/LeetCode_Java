package leetcode.p2.p23.e236;

/**
 *
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Util {
    public static void traversPrint(TreeNode node) {
        if(null != node.left) traversPrint(node.left);
        System.out.print(", " + node.val);
        if(null != node.right) traversPrint(node.right);
    }
}
