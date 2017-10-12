package leetcode.p1.e168;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Test {
    public static void test() {
        new Solution().convertToTitle(26);
        for(int i = 0; i < 100; i++) System.out.println(i + ": " + new Solution().convertToTitle(i));
    }
}
