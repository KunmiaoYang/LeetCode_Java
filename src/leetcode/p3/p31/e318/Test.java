package leetcode.p3.p31.e318;

import java.util.Arrays;

/**
 *
 * Created by admin on 2017/7/3.
 */
public class Test {
    public static void test() {
        test(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"});
        test(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"});
        test(new String[]{"a", "aa", "aaa", "aaaa"});
    }
    static void test(String[] words) {
        int res;
        long startTime=System.currentTimeMillis();
        res = new Solution().maxProduct(words);
        long endTime=System.currentTimeMillis();
        System.out.println("Max product of " + Arrays.toString(words) + " = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

    }
}
