package leetcode.p0.p08.e082;

/**
 *
 * Created by kunmiao.yang on 2017/6/26.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0), node = dummyHead, pre, next = head;
        dummyHead.next = head;
        while (null != next) {
            if(null != next.next && next.val == next.next.val) {
                do {
                    pre = next;
                    next = next.next;
                } while (null != next && pre.val == next.val);
                node.next = next;
            } else {
                node = next;
                next = node.next;
            }
        }
        return dummyHead.next;
    }
}