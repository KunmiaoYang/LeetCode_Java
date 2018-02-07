package leetcode.p1.p11.e114;

/**
 *
 * Created by kunmiao.yang on 2017/5/9.
 */
public class FlattenTree {
    public void flatten(TreeNode root) {
        if(null != root) flattenRec(root);
    }
    public TreeNode flattenRec(TreeNode node) {
        TreeNode ret = node;
        if(null != node.left) {
            ret = flattenRec(node.left);
            ret.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        if(null != ret.right) ret = flattenRec(ret.right);
        return ret;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        long startTime=System.currentTimeMillis();
        new FlattenTree1().flatten(root);
        long endTime=System.currentTimeMillis(); //获取结束时间
        for(TreeNode node = root; null != node; node = node.right) System.out.println(node.val);
        System.out.println("Time span: "+(endTime-startTime)+"ms");
    }
}
