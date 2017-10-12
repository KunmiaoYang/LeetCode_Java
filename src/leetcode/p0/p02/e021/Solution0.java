package leetcode.p0.p02.e021;

/**
 * Created by kunmiao.yang on 2017/5/19.
 */
public class Solution0 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null == l1) return l2;
        if(null == l2) return l1;
        ListNode dummyHead = new ListNode(0), p = dummyHead, listSmall, listLarge;
        if(l1.val < l2.val) {
            listSmall = l1;
            listLarge = l2;
        } else {
            listSmall = l2;
            listLarge = l1;
        }
        while (null != listLarge) {
            p.next = listSmall;
            do p = p.next; while (null != p.next && p.next.val < listLarge.val);
            listSmall = listLarge;
            listLarge = p.next;
        }
        p.next = listSmall;
        return dummyHead.next;
    }
}