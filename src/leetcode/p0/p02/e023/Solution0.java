package leetcode.p0.p02.e023;

import java.util.PriorityQueue;

/**
 *
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution0 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (o1, o2) -> o1.val - o2.val);
        for(ListNode node:lists) if(null != node) pq.add(node);
        if(pq.isEmpty()) return null;
        ListNode dummyHead = new ListNode(0), p = dummyHead;
        while (!pq.isEmpty()) {
            p.next = pq.poll();
            p = p.next;
            if(null != p.next) pq.add(p.next);
        }
        return dummyHead.next;
    }
}