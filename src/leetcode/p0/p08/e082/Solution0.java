package leetcode.p0.p08.e082;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Created by kunmiao.yang on 2017/6/26.
 */
public class Solution0 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0), node = dummyHead;
        dummyHead.next = head;
        Set<Integer> dupSet = new HashSet<>();
        while (null != node.next) {
            if(null != node.next.next && node.next.val == node.next.next.val) {
                dupSet.add(node.next.val);
                node.next.next = node.next.next.next;
            } else if(dupSet.contains(node.next.val)) {
                node.next = node.next.next;
            } else node = node.next;
        }
        return dummyHead.next;
    }
}