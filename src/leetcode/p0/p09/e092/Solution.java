package leetcode.p0.p09.e092;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0), start = dummyHead, end;
        dummyHead.next = head;
        for(int i = 1; i < m; i++) start = start.next;
        end = start.next;
        for(int i = m; i < n; i++) {
            ListNode current = end.next;
            end.next = current.next;
            current.next = start.next;
            start.next = current;
        }
        return dummyHead.next;
    }
}