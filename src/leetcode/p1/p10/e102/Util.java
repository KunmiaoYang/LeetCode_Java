package algorithms.p1.p10.e102;

/**
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Util {
    public static void traversPrint(TreeNode node) {
        if(null != node.left) traversPrint(node.left);
        System.out.print(", " + node.val);
        if(null != node.right) traversPrint(node.right);
    }
}
