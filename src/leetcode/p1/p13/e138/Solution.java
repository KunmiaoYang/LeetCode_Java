package leetcode.p1.p13.e138;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Kunmiao Yang on 9/20/2017.
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> nodeMap = new HashMap<>();
        for(RandomListNode p = head; null != p; p = p.next) nodeMap.put(p, new RandomListNode(p.label));
        for(RandomListNode p = head; null != p; p = p.next) {
            RandomListNode copy = nodeMap.get(p);
            if(null != p.next) copy.next = nodeMap.get(p.next);
            copy.random = nodeMap.get(p.random);
        }
        return nodeMap.get(head);
    }
}
