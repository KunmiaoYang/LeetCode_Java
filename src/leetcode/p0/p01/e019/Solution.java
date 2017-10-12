package leetcode.p0.p01.e019;

/**
 *
 * Created by kunmiao.yang on 2017/5/19.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0), beforeNode = dummyNode, tailNode = head, temp;
        dummyNode.next = head;
        for(int i = 1; i < n; i++) tailNode = tailNode.next;
        for (;null != tailNode.next;tailNode = tailNode.next) beforeNode = beforeNode.next;
        temp = beforeNode.next;
        beforeNode.next = temp.next;
        temp.next = null;
        return dummyNode.next;
    }
}