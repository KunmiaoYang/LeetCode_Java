package leetcode.p0.p09.e092;

import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/26.
 */
public class Test {
    public static void test() {
        test(new int[]{5}, 1, 1);
        test(new int[]{1,2,3,4}, 1, 4);
        test(new int[]{1,2,3,4,5,6,7,8}, 3, 7);
    }
    static void test(int[] vals, int m, int n) {
        ListNode head = Util.createList(vals),  res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().reverseBetween(head, m, n);
        endTime = System.currentTimeMillis();
        System.out.println("Reverse: " + Arrays.toString(vals) + " from " + m + " to " + n);
        System.out.print("Result: ");
        Util.printList(res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
