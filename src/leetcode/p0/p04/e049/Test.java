package leetcode.p0.p04.e049;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/8.
 */
public class Test {
    public static void test() {
        String[] input;
        long startTime, endTime;
        List<List<String>> res;

        input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(Arrays.toString(input));
        startTime = System.currentTimeMillis();
        res = new Solution().groupAnagrams(input);
        endTime = System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
