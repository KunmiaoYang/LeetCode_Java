package leetcode.p0.p02.e023;

/**
 *
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0) return null;
        return mergeKLists(lists, 0, lists.length-1);
    }
    public ListNode mergeKLists(ListNode[] lists, int beg, int end) {
        if(beg==end) return lists[beg];
        int mid = (beg + end) / 2;
        return mergeTwoLists(mergeKLists(lists, beg, mid), mergeKLists(lists, mid+1, end));
    }
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