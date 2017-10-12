package leetcode.p4.p45.e451;

/**
 *
 * Created by admin on 2017/6/28.
 */
public class Test {
    public static void test() {
        test("2a554442f544asfasssffffasss");
        test("");
        test("tree");
        test("cccaaa");
        test("Aabb");
    }
    static void test(String s) {
        System.out.print("Input: \"" + s + "\"");
        System.out.println("\tOutput: \"" + new Solution().frequencySort(s) + "\"");
    }
}
