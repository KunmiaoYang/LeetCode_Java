package leetcode.p0.p05.e055;

/**
 *
 * Created by admin on 2017/6/13.
 */
public class Test {
    public static void test() {
        int[] nums = {2, 3, 2, 2, 0, 1};
        int res;

        System.out.println("result = " + new Solution().canJump(new int[]{2, 3, 2, 2, 0, 1}));
        System.out.println("result = " + new Solution().canJump(new int[]{2, 3, 2, 1, 0}));
        System.out.println("result = " + new Solution().canJump(new int[]{2, 3, 2, 1, 0, 1}));
    }
}
