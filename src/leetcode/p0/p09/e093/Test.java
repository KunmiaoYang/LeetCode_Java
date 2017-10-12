package leetcode.p0.p09.e093;

import java.util.List;

/**
 * Created by kunmiao.yang on 2017/6/1.
 */
public class Test {
    public static void test() {
        List<String> res;
        long startTime, endTime;
        String s;

        s = "255255255255";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().restoreIpAddresses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = "010010";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().restoreIpAddresses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = "0000";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().restoreIpAddresses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = "25525511135";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().restoreIpAddresses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = "34574678";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().restoreIpAddresses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
