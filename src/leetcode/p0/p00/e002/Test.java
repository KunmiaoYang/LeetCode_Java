package leetcode.p0.p00.e002;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Created by Kunmiao Yang on 1/25/2018.
 */
public class Test {
    public static void test() {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(0);
        Set<ListNode> set = new HashSet<ListNode>(){{add(n1); add(n2); add(n1);}};
        System.out.println(set.size());
    }
}
