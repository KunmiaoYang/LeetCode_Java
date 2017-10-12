package leetcode.p0.p03.e032;

/**
 *
 * Created by kunmiao.yang on 2017/5/26.
 */
public class Test {
    public static void test() {
        String s;
        long startTime, endTime;
        int res;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<15000; i++) sb.append("(");
        for(int i = 0; i<1342; i++) sb.append(")");
        s = sb.toString();
//        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().longestValidParentheses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = "))))((()((";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().longestValidParentheses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = "(()(()()()";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().longestValidParentheses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = "(())()()()(((()";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().longestValidParentheses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = ")))))(((";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().longestValidParentheses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        s = "()(()";
        System.out.println(s);
        startTime=System.currentTimeMillis();
        res = new Solution().longestValidParentheses(s);
        endTime=System.currentTimeMillis();
        System.out.println("Result = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
