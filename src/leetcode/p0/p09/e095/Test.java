package leetcode.p0.p09.e095;


import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/5/25.
 */
public class Test {
    public static void test() {
        test(10);
        test(4);
        test(2);
        test(3);
    }
    static void test(int n) {
        List<TreeNode> res;
        long startTime=System.currentTimeMillis();
        res = new Solution().generateTrees(n);
        long endTime=System.currentTimeMillis();
        System.out.print("n = " + n + "\tList size = " + res.size());
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
//        for(TreeNode root: res) {
//            Util.BFSPrint(root);
//            System.out.println();
//        }
    }
}
