package leetcode.p0.p05.e051;

import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/9.
 */
public class Test {
    public static void test() {
        int input = 9;
        List<List<String>> res;
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        res = new Solution().solveNQueens(input);
        endTime = System.currentTimeMillis();
        System.out.println("Result = ");
//        for(List<String> sol: res) {
//            Util.printMatrix(sol);
//            System.out.println();
//        }
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution4().solveNQueens(input);
        endTime = System.currentTimeMillis();
        System.out.println("Result = ");
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution1().solveNQueens(input);
        endTime = System.currentTimeMillis();
        System.out.println("Result = ");
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        res = new Solution3().solveNQueens(input);
        endTime = System.currentTimeMillis();
        System.out.println("Result = ");
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
