package leetcode.p0.p04.e043;

/**
 *
 * Created by kunmiao.yang on 2017/5/27.
 */
public class Test {
    public static void test() {
        String input1, input2, res = "";
        long startTime, endTime;
        StringBuilder sb = new StringBuilder();

        input1 = "0"; input2 = "99";
        startTime=System.currentTimeMillis();
        res = new Solution().multiply(input1, input2);
        endTime=System.currentTimeMillis();
        System.out.println(input1 + " * " + input2 + " = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        for(int i = 0; i<110; i++) sb.append('9');
        input1 = sb.toString(); input2 = input1;
        startTime=System.currentTimeMillis();
        for(int i = 0; i<200; i++) res = new Solution().multiply(input1, input2);
        endTime=System.currentTimeMillis();
        System.out.println(input1 + " * " + input2 + " = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        startTime=System.currentTimeMillis();
        for(int i = 0; i<200; i++) res = new Solution0().multiply(input1, input2);
        endTime=System.currentTimeMillis();
        System.out.println(input1 + " * " + input2 + " = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");

        input1 = "99"; input2 = "99";
        startTime=System.currentTimeMillis();
        res = new Solution().multiply(input1, input2);
        endTime=System.currentTimeMillis();
        System.out.println(input1 + " * " + input2 + " = " + res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
