package leetcode.p1.e148;

/**
 *
 * Created by admin on 2017/6/17.
 */
public class Util {
    public static ListNode createList(int[] arr) {
        ListNode dummyHead = new ListNode(0), node = dummyHead;
        for(int i: arr) {
            node.next = new ListNode(i);
            node = node.next;
        }
        return dummyHead.next;
    }

    public static void printList(final ListNode head) {
        ListNode node = head;
        System.out.print("[\t");
        while (null != node) {
            System.out.print(node.val + "\t");
            node = node.next;
        }
        System.out.println("]");
    }
}
