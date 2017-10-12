package leetcode.p0.p09.e092;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Solution2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        ListNode dummyHead = new ListNode(0), before = dummyHead, prev, current;
        dummyHead.next = head;
        for(int i = 1; i < m; i++) before = before.next;
        prev = before.next;
        current = prev.next;
        for(int i = m + 1; i < n; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        before.next.next = current.next;
        current.next = prev;
        before.next = current;
        return dummyHead.next;
    }
}