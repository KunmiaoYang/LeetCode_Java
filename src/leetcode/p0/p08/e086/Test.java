package leetcode.p0.p08.e086;


import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/26.
 */
public class Test {
    public static void test() {
        test(new int[]{}, 0);
        test(new int[]{1,4,3,2,5,2}, 3);
        test(new int[]{5,5,3,3,4,4,2,1,2,0}, 2);
        test(new int[]{5,5,3,3,4,4,2,1,2,0}, 3);
        test(new int[]{5,5,3,3,4,4,2,1,2,0}, 4);
        test(new int[]{1,1}, 1);
    }
    static void test(int[] vals, int x) {
        ListNode head = Util.createList(vals),  res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().partition(head, x);
        endTime = System.currentTimeMillis();
        System.out.println("Patition sequence: " + Arrays.toString(vals) + " by " + x);
        System.out.print("Result: ");
        Util.printList(res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
