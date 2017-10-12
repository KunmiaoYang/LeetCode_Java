package leetcode.p0.p00.e002;

/**
 * Created by kunmiao.yang on 2017/5/10.
 */
public class Factory {
    public static ListNode createListNode(int digit) {
        ListNode root = new ListNode(0), node = root;
        while(digit>0){
            node.next = new ListNode(digit%10);
            digit = (digit-node.val)/10;
            node = node.next;
        }
        if(null==root.next) return root;
        return root.next;
    }
}
