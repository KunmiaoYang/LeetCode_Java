package leetcode.p0.p09.e092;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * Created by admin on 2017/7/7.
 */
public class Solution1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode p = head, nodeReverse;
        Deque<Integer> deque = new ArrayDeque<>(n);
        for(int i = 1; i < m; i++) p = p.next;
        nodeReverse = p;
        for(int i = m - 1; i < n; i++, nodeReverse = nodeReverse.next) deque.add(nodeReverse.val);
        for(; !deque.isEmpty(); p = p.next) p.val = deque.pollLast();
        return head;
    }
}