package leetcode.p1.p14.e140;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 11/22/2017.
 */
public class Test {
    public static void test() {
        test("catsanddog",
                Arrays.asList("cat", "cats", "and", "sand", "dog"));
        test("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"));
    }

    public static void test(String s, List<String> wordDict) {
        System.out.println(new Solution().wordBreak(s, wordDict));
    }
}
