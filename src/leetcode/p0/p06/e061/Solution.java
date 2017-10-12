package leetcode.p0.p06.e061;

/**
 *
 * Created by admin on 2017/6/17.
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(1 > k || null == head) return head;
        ListNode fast = head, slow = head;
        int length = 1;
        for(int i = 0; i < k && null != fast.next; i++, length++) fast = fast.next;
        if(length > k) {
            for (; null != fast.next; fast = fast.next) slow = slow.next;
            fast.next = head;
            head = slow.next;
            slow.next = null;
            return head;
        }
        return rotateRight(head, k % length);
    }
}