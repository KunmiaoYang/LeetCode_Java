package leetcode.p1.p14.e148;

/**
 *
 * Created by admin on 2017/7/3.
 */
public class Test {
    public static void test() {
        test(new int[]{});
        test(new int[]{5});
        test(new int[]{5,4,3,2,1});
    }
    static void test(int[] nums) {
        ListNode inp = Util.createList(nums), res;
        System.out.print("Input:  ");
        Util.printList(inp);
        res = new Solution().sortList(inp);
        System.out.print("Result: ");
        Util.printList(res);
    }
}
