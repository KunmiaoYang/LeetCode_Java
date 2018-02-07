package leetcode.p1.p14.e148;

/**
 *
 * Created by admin on 2017/7/3.
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        ListNode dummyHead = new ListNode(0), l1, l2, p;
        dummyHead.next = head;
        int n;
        for(n = 0, p = head; p != null; p = p.next) n++;
        outer: for(int step = 1; step < n; step <<= 1) {
            p = dummyHead;
            while (null != p.next) {
                l1 = p.next;
                l2 = l1;
                for(int i = 0; i < step; i++) {
                    if(null == l2) continue outer;
                    l2 = l2.next;
                }
                for(int i = 0, j = 0; true; ) {
                    if(i == step) {
                        p.next = l2;
                        for (;j < step && null != p.next; j++) p = p.next;
                        break;
                    } else if(j == step || null == l2) {
                        p.next = l1;
                        for(; i < step; i++) p = p.next;
                        p.next = l2;
                        break;
                    } else if(l1.val < l2.val) {
                        p.next = l1;
                        p = l1;
                        l1 = l1.next;
                        i++;
                    } else {
                        p.next = l2;
                        p = l2;
                        l2 = l2.next;
                        j++;
                    }
                }
            }
        }
        return dummyHead.next;
    }
}