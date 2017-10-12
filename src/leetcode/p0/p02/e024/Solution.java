package leetcode.p0.p02.e024;

/**
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0), tailNode = dummyHead, oddNode = head, evenNode;
        while (null != oddNode) {
            evenNode = oddNode.next;
            if(null != evenNode) {
                tailNode.next = evenNode;
                tailNode = oddNode;
                oddNode = evenNode.next;
                evenNode.next = tailNode;
            } else {
                tailNode.next = oddNode;
                return dummyHead.next;
            }
        }
        tailNode.next = null;
        return dummyHead.next;
    }
}
