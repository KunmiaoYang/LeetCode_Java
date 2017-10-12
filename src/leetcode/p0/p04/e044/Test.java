package leetcode.p0.p04.e044;

/**
 *
 * Created by kunmiao.yang on 2017/6/2.
 */
public class Test {
    public static void test() {
        String s, p;
        boolean res;
        long startTime, endTime;
        StringBuilder sb = new StringBuilder();

        s = "aa";
        p = "a";
        startTime = System.currentTimeMillis();
        res = new Solution().isMatch(s, p);
        endTime = System.currentTimeMillis();
        System.out.print(s + " match " + p + " = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        s = "aa";
        p = "aa";
        startTime = System.currentTimeMillis();
        res = new Solution().isMatch(s, p);
        endTime = System.currentTimeMillis();
        System.out.print(s + " match " + p + " = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        s = "aaa";
        p = "aa";
        startTime = System.currentTimeMillis();
        res = new Solution().isMatch(s, p);
        endTime = System.currentTimeMillis();
        System.out.print(s + " match " + p + " = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        s = "aa";
        p = "*";
        startTime = System.currentTimeMillis();
        res = new Solution().isMatch(s, p);
        endTime = System.currentTimeMillis();
        System.out.print(s + " match " + p + " = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        s = "aa";
        p = "a*";
        startTime = System.currentTimeMillis();
        res = new Solution().isMatch(s, p);
        endTime = System.currentTimeMillis();
        System.out.print(s + " match " + p + " = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        s = "ab";
        p = "?*";
        startTime = System.currentTimeMillis();
        res = new Solution().isMatch(s, p);
        endTime = System.currentTimeMillis();
        System.out.print(s + " match " + p + " = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");

        s = "aab";
        p = "c*a*b";
        startTime = System.currentTimeMillis();
        res = new Solution().isMatch(s, p);
        endTime = System.currentTimeMillis();
        System.out.print(s + " match " + p + " = " + res);
        System.out.println("\tTime span: " + (endTime - startTime) + "ms");
    }
}
