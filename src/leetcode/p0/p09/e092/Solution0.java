package leetcode.p0.p09.e092;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Solution0 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0), p = dummyHead, nodeReverse, nodeN, tail;
        dummyHead.next = head;
        Deque<ListNode> deque = new ArrayDeque<>(n);
        for(int i = 1; i < m; i++) p = p.next;
        nodeReverse = p.next;
        for(int i = m; i < n; i++, nodeReverse = nodeReverse.next) deque.add(nodeReverse);
        nodeN = nodeReverse;
        tail = nodeReverse.next;
        for(; !deque.isEmpty(); nodeReverse = nodeReverse.next) nodeReverse.next = deque.pollLast();
        nodeReverse.next = tail;
        p.next = nodeN;
        return dummyHead.next;
    }
}