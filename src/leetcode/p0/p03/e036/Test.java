package leetcode.p0.p03.e036;

/**
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Test {
    public static void test() {
        char[][] input;
        boolean res;
        long startTime, endTime;

        input = Util.createMatrix(new String[]{".87654321","2........","3........","4........","5........","6........","7........","8........","9........"});
        Util.printMatrix(input);
        startTime=System.currentTimeMillis();
        res = new Solution().isValidSudoku(input);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        Util.printMatrix(input);
        startTime=System.currentTimeMillis();
        res = new Solution().isValidSudoku(input);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
//        Util.printMatrix(input);
    }
}
