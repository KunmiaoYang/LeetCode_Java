package leetcode.p1.p13.e138;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Kunmiao Yang on 9/20/2017.
 */
public class Solution0 {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode dummyhead = new RandomListNode(0), pOrig, pCopy;
        Map<RandomListNode, List<RandomListNode>> randMap = new HashMap<>();
        for (pOrig = head, pCopy = dummyhead; null != pOrig; pOrig = pOrig.next, pCopy = pCopy.next) {
            pCopy.next = new RandomListNode(pOrig.label);
            List<RandomListNode> fromList= randMap.getOrDefault(pOrig.random, new LinkedList<>());
            if(fromList.isEmpty()) randMap.put(pOrig.random, fromList);
            fromList.add(pCopy.next);
        }
        for (pOrig = head, pCopy = dummyhead.next; null != pCopy; pOrig = pOrig.next, pCopy = pCopy.next) {
            List<RandomListNode> fromList = randMap.get(pOrig);
            if(null != fromList) for(RandomListNode randFrom: fromList) randFrom.random = pCopy;
        }
        return dummyhead.next;
    }
}
