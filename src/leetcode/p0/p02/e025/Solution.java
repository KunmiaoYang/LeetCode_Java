package leetcode.p0.p02.e025;

/**
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<2 || null==head) return head;
        ListNode dummyHead = new ListNode(0), curNode = head, tailNode = dummyHead, nextNode = head;
        while (null != curNode) {
            for(int i = 1; i<k; i++){
                curNode = curNode.next;
                if(null == curNode) {
                    tailNode.next = head;
                    return dummyHead.next;
                }
            }
            tailNode.next = curNode;
            tailNode = head;
            curNode = head.next;
            for(int i = 1; i<k; i++) {
                nextNode = curNode.next;
                curNode.next = head;
                head = curNode;
                curNode = nextNode;
            }
            head = nextNode;
        }
        tailNode.next = null;
        return dummyHead.next;
    }
}
