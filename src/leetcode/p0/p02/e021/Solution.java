package leetcode.p0.p02.e021;

/**
 *
 * Created by kunmiao.yang on 2017/5/19.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null == l1) return l2;
        if(null == l2) return l1;
        ListNode p;
        if(l1.val < l2.val) {
            p = l1;
            while (null != p.next && p.next.val < l2.val) p = p.next;
            p.next = mergeTwoLists(p.next, l2);
            return l1;
        } else {
            p = l2;
            while (null != p.next && p.next.val < l1.val) p = p.next;
            p.next = mergeTwoLists(p.next, l1);
            return l2;
        }
    }
}