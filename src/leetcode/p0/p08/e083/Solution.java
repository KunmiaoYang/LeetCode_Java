package leetcode.p0.p08.e083;

/**
 *
 * Created by kunmiao.yang on 2017/6/26.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0), node = dummyHead, next = head;
        dummyHead.next = head;
        while (null != next) {
            while (null != next.next && next.val == next.next.val) next = next.next;
            node.next = next;
            node = next;
            next = next.next;
        }
        return dummyHead.next;
    }
}