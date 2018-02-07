package leetcode.p1.p13.e133;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * Created by Kunmiao Yang on 11/16/2017.
 */
public class Solution {
    // BFS
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(null == node) return null;
        UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        Deque<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(cloneNode);
        map.put(node.label, cloneNode);
        while(!queue.isEmpty()) {
            UndirectedGraphNode curNode = queue.pop(), curCloneNode = queue.pop(), newNode;
            for(UndirectedGraphNode neighbor: curNode.neighbors) {
                if(map.containsKey(neighbor.label)) {
                    curCloneNode.neighbors.add(map.get(neighbor.label));
                } else {
                    newNode = new UndirectedGraphNode(neighbor.label);
                    curCloneNode.neighbors.add(newNode);
                    queue.add(neighbor);
                    queue.add(newNode);
                    map.put(newNode.label, newNode);
                }
            }
        }
        return cloneNode;
    }
}
