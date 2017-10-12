package leetcode.p0.p07.e076;

/**
 *
 * Created by admin on 2017/6/21.
 */
public class Test {
    public static void test() {
        test("", "ABC");
        test("ADOBECODEBANC", "");
        test("ADOBECODEBANC", "ABC");
        test("a", "a");
        test("a", "aa");
    }
    static void test(String s, String t) {
        System.out.println("Minimum Substring in \"" + s + "\" containing \""+ t + "\" is: \"" + new Solution().minWindow(s, t) + "\"");
    }
}
