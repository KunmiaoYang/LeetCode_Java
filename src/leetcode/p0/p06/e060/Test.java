package leetcode.p0.p06.e060;

/**
 *
 * Created by admin on 2017/6/15.
 */
public class Test {
    public static void test() {
        System.out.println(new Solution().getPermutation(1, 100));
        for(int i = 1; i<11; i++) System.out.println(new Solution().getPermutation(9, i));
        System.out.println();
    }
}
