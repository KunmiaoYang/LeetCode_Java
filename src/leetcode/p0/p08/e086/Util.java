package leetcode.p0.p08.e086;


/**
 *
 * Created by kunmiao.yang on 2017/5/19.
 */
public class Util {
    public static ListNode createList(int[] vals) {
        if(vals.length<1) return null;
        ListNode head = new ListNode(vals[0]), curNode = head;
        for(int i = 1; i<vals.length; i++) {
            curNode.next = new ListNode(vals[i]);
            curNode = curNode.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        System.out.print("[");
        for(ListNode node = head; null != node; node = node.next) System.out.print(node.val + ", ");
        System.out.println("]");
    }
}
