package leetcode.p0.p08.e084;

/**
 *
 * Created by admin on 2017/6/18.
 */
public class Test {
    public static void test() {
        System.out.println("Result = " + new SolutionX().largestRectangleArea(new int[]{1,4,7,8,9,6,2}));
        System.out.println("Result = " + new Solution().largestRectangleArea(new int[]{1,4,7,8,9,6,2}));
        System.out.println("Result = " + new Solution().largestRectangleArea(new int[]{2,1,5,6,2,3}));
        System.out.println("Result = " + new Solution().largestRectangleArea(new int[]{}));
    }
}
