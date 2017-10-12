package leetcode.p0.p03.e038;

/**
 *
 * Created by kunmiao.yang on 2017/5/31.
 */
public class Test {
    public static void test() {
        String res;
        long startTime, endTime;
        int n;

        n = 1;
        startTime=System.currentTimeMillis();
        res = new Solution().countAndSay(n);
        endTime=System.currentTimeMillis();
        System.out.println("n = " + n + "\tResult = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        n = 2;
        startTime=System.currentTimeMillis();
        res = new Solution().countAndSay(n);
        endTime=System.currentTimeMillis();
        System.out.println("n = " + n + "\tResult = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        n = 3;
        startTime=System.currentTimeMillis();
        res = new Solution().countAndSay(n);
        endTime=System.currentTimeMillis();
        System.out.println("n = " + n + "\tResult = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        n = 4;
        startTime=System.currentTimeMillis();
        res = new Solution().countAndSay(n);
        endTime=System.currentTimeMillis();
        System.out.println("n = " + n + "\tResult = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        n = 5;
        startTime=System.currentTimeMillis();
        res = new Solution().countAndSay(n);
        endTime=System.currentTimeMillis();
        System.out.println("n = " + n + "\tResult = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
