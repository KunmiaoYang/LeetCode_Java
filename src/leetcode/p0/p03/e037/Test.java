package leetcode.p0.p03.e037;


/**
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Test {
    public static void test() {
        char[][] input;
        boolean res;
        long startTime, endTime;

        input = Util.createMatrix(new String[]{"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."});
        Util.printMatrix(input);
        startTime=System.currentTimeMillis();
        new Solution().solveSudoku(input);
        endTime=System.currentTimeMillis();
        System.out.println("Result = ");
        Util.printMatrix(input);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

//        input = new char[][]{
//                {'5','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}};
//        Util.printMatrix(input);
//        startTime=System.currentTimeMillis();
//        new Solution().solveSudoku(input);
//        endTime=System.currentTimeMillis();
//        System.out.println("Result = ");
//        Util.printMatrix(input);
//        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
