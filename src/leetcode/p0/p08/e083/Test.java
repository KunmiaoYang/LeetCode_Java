package leetcode.p0.p08.e083;


import java.util.Arrays;

/**
 *
 * Created by kunmiao.yang on 2017/6/26.
 */
public class Test {
    public static void test() {
        test(new int[]{});
        test(new int[]{1,2,3,3,4,4,5,5});
        test(new int[]{1,1});
        test(new int[]{1,2,3,3,4,4,5});
    }
    static void test(int[] vals) {
        ListNode head = Util.createList(vals),  res;
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        res = new Solution().deleteDuplicates(head);
        endTime = System.currentTimeMillis();
        System.out.println("Delete duplicates from sequence: " + Arrays.toString(vals));
        System.out.print("Result: ");
        Util.printList(res);
        System.out.println("Time span: " + (endTime - startTime) + "ms");
    }
}
