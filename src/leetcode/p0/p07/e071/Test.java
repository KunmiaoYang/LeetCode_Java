package leetcode.p0.p07.e071;

/**
 *
 * Created by kunmiao.yang on 2017/6/20.
 */
public class Test {
    public static void test() {
        test("/home/");
        test("/a/./b/../../c/");
        test("/a/./b/../c/");
        test("///../../a/..");
    }

    static void test(String path) {
        String res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().simplifyPath(path);
        endTime = System.currentTimeMillis();
        System.out.print("simplify(" + path + ") = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
