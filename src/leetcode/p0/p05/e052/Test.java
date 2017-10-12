package leetcode.p0.p05.e052;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Test {
    public static void test() {
        int input = 12;
        int res;
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        res = new Solution0().totalNQueens(13);
        endTime = System.currentTimeMillis();
        System.out.print("Result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution().totalNQueens(13);
        endTime = System.currentTimeMillis();
        System.out.print("Result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution0().totalNQueens(13);
        endTime = System.currentTimeMillis();
        System.out.print("Result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution().totalNQueens(13);
        endTime = System.currentTimeMillis();
        System.out.print("Result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

//        startTime = System.currentTimeMillis();
//        res = new Solution().totalNQueens(8);
//        endTime = System.currentTimeMillis();
//        System.out.print("Result = " + res);
//        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
//
//        startTime = System.currentTimeMillis();
//        res = new Solution().totalNQueens(9);
//        endTime = System.currentTimeMillis();
//        System.out.print("Result = " + res);
//        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
//
//        startTime = System.currentTimeMillis();
//        res = new Solution().totalNQueens(10);
//        endTime = System.currentTimeMillis();
//        System.out.print("Result = " + res);
//        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
//
//        startTime = System.currentTimeMillis();
//        res = new Solution().totalNQueens(11);
//        endTime = System.currentTimeMillis();
//        System.out.print("Result = " + res);
//        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
//
//        startTime = System.currentTimeMillis();
//        res = new Solution().totalNQueens(12);
//        endTime = System.currentTimeMillis();
//        System.out.print("Result = " + res);
//        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
