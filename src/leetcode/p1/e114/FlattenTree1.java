package algorithms.p1.e114;

/**
 *
 * Created by kunmiao.yang on 2017/5/9.
 */
public class FlattenTree1 {
    private TreeNode prev;
    public void flatten(TreeNode root) {
        if(null == root) return;
        flatten(root.left);
        flatten(root.right);
        root.right = prev;
        root.left = null;
        prev = root;
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
