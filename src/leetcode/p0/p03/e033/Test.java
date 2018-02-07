package leetcode.p0.p03.e033;

/**
 * Created by admin on 2017/5/26.
 */
public class Test {
    public static void test() {
        int[] nums = {5,6,7,10,15,-11,-10,-5,-3,0};
        int res;

        System.out.println("result = " + new Solution().search(new int[]{0,1}, 1));
        System.out.println("result = " + new Solution().search(new int[]{4,5,6,7,0,1,2}, 1));
        System.out.println("result = " + new Solution().search(new int[]{5,1,3}, 1));
        System.out.println("result = " + new Solution().search(new int[]{1, 3}, 1));
        System.out.println("result = " + new Solution().search(new int[]{3, 1}, 1));
        System.out.println("result = " + new Solution().search(new int[]{5,6,4,5,5,5,5,5,5}, 6));
        System.out.println("result = " + new Solution().search(null, -10));
    }
}
