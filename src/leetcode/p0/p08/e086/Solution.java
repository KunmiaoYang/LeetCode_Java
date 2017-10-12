package leetcode.p0.p08.e086;

/**
 *
 * Created by kunmiao.yang on 2017/6/29.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead = new ListNode(0), partitionNode = dummyHead, current, next;
        dummyHead.next = head;
        while (null != partitionNode.next && partitionNode.next.val < x) partitionNode = partitionNode.next;
        current = partitionNode;
        next = current.next;
        while (null != next) {
            if(next.val < x) {
                current.next = next.next;
                next.next = partitionNode.next;
                partitionNode.next = next;
                partitionNode = next;
            } else current = next;
            next = current.next;
        }
        return dummyHead.next;
    }
}