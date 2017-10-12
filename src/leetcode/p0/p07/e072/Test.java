package leetcode.p0.p07.e072;

/**
 *
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Test {
    public static void test() {
        test("abababab", "babababa");
        test("abababab", "bababab");
        test("abababa", "babababa");
        test("abcde", "cbade");
        test("11111", "11111");
        test("", "");
        test("0", "0");
        test("10", "1");
    }
    static void test(String word1, String word2) {
        int res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().minDistance(word1, word2);
        endTime = System.currentTimeMillis();
        System.out.println("Min distance from \"" + word1 + "\" to \"" + word2 + "\" = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
