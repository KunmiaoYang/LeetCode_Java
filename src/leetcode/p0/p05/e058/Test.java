package leetcode.p0.p05.e058;

/**
 *
 * Created by kunmiao.yang on 2017/6/14.
 */
public class Test {
    public static void test() {
        String inp;
        int res;
        long startTime, endTime;

        inp = "";
        startTime = System.currentTimeMillis();
        res = new Solution().lengthOfLastWord(inp);
        endTime = System.currentTimeMillis();
        System.out.print("result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        inp = "  abc   ";
        startTime = System.currentTimeMillis();
        res = new Solution().lengthOfLastWord(inp);
        endTime = System.currentTimeMillis();
        System.out.print("result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        inp = "Hello World";
        startTime = System.currentTimeMillis();
        res = new Solution().lengthOfLastWord(inp);
        endTime = System.currentTimeMillis();
        System.out.print("result = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
