package leetcode.p1.p13.e133;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Kunmiao Yang on 11/16/2017.
 */
public class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
}
