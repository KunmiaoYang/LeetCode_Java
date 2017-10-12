package leetcode.p0.p06.e063;

/**
 *
 * Created by admin on 2017/6/18.
 */
public class Test {
    public static void test() {
        System.out.println("Result = " + new Solution().uniquePathsWithObstacles(new int[][]{{0,0,0,0,1,0},{0,1,0,0,0,0}}));
        System.out.println("Result = " + new Solution().uniquePathsWithObstacles(new int[][]{{0,1,0,0,0},{0,0,0,1,0}}));
        System.out.println("Result = " + new Solution().uniquePathsWithObstacles(new int[][]{{0,1,0},{0,0,0},{0,1,0}}));
        System.out.println("Result = " + new Solution().uniquePathsWithObstacles(new int[][]{{0,0,0},{0,0,0},{0,0,0}}));
        System.out.println("Result = " + new Solution().uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
}
