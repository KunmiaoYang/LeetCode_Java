package leetcode.p0.p08.e087;

/**
 *
 * Created by kunmiao.yang on 2017/6/29.
 */
public class Test {
    public static void test() {
        test("ccabcbabcbabbbbcbb", "bbbbabccccbbbabcba");
        test("abcd", "cadb");
        test("abb", "bab");
        test("", "");
        test("aaaabb", "aabbaa");
        test("great", "rgtae");
        test("great", "rtaeg");
    }
    static void test(String s1, String s2) {
        boolean res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().isScramble(s1, s2);
        endTime = System.currentTimeMillis();
        System.out.println("s1: \"" + s1 + "\"\t s2: \"" + s2 + "\"");
        System.out.print("Result: " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
