package leetcode.p1.p13.e139;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 9/8/2017.
 */
public class Test {
    static public void test() {
        System.out.println("Result = " + new Solution().wordBreak("leetcode", Arrays.asList("leet", "code")));
        System.out.println("Result = " + new Solution().wordBreak("leetcode", Arrays.asList("leetcod", "code")));
        System.out.println("Result = " + new Solution().wordBreak("leetcode", Arrays.asList("leetcod", "leet", "tcode", "e")));
        System.out.println("Result = " + new Solution().wordBreak("leetode", Arrays.asList("leet", "code")));
    }
}
