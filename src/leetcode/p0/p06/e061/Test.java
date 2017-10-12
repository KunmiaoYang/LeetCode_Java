package leetcode.p0.p06.e061;

/**
 *
 * Created by admin on 2017/6/17.
 */
public class Test {
    public static void test() {
        ListNode inp, res;

        inp = Util.createList(new int[]{1, 2, 3, 4, 5});
        System.out.print("Input:  ");
        Util.printList(inp);
        res = new Solution().rotateRight(inp, 100000003);
        System.out.print("Result: ");
        Util.printList(res);

        inp = Util.createList(new int[]{});
        System.out.print("Input:  ");
        Util.printList(inp);
        res = new Solution().rotateRight(inp, 5);
        System.out.print("Result: ");
        Util.printList(res);

        inp = Util.createList(new int[]{1});
        System.out.print("Input:  ");
        Util.printList(inp);
        res = new Solution().rotateRight(inp, 4);
        System.out.print("Result: ");
        Util.printList(res);
    }
}
