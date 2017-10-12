package leetcode.p0.p02.e023;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution1 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0) return null;
        if(lists.length == 1) return lists[0];
        LinkedList<ListNode> listNodes = new LinkedList<>(Arrays.asList(lists));
        ListNode res;
        while (true) {
            res = mergeTwoLists(listNodes.pop(), listNodes.pop());
            if(listNodes.isEmpty()) break;
            listNodes.add(res);
        }
        return res;
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