package leetcode.p3.p39.e392;

/**
 *
 * Created by admin on 2017/7/5.
 */
public class Test {
    public static void test() {
        test("", "ahbgdc");
        test("abc", "ahbgdc");
        test("axc", "ahbgdc");
        test(new String[]{"", "abc", "axc"}, "ahbgdc");
    }
    static void test(String s, String t) {
        boolean res;
        long startTime=System.currentTimeMillis();
        res = new Solution().isSubsequence(s, t);
        long endTime=System.currentTimeMillis();
        System.out.print("Does \"" + s + "\" exist in \"" + t + "\"? " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
    static void test(String[] s, String t) {
        boolean res;
        long startTime=System.currentTimeMillis();
        SolutionFU sol = new SolutionFU(t);
        for(String str: s) {
            res = sol.isSubsequence(str);
            System.out.println("Does \"" + str + "\" exist in \"" + t + "\"? " + res);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
