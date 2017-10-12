package leetcode.p0.p00.e002;

/**
 * Created by kunmiao.yang on 2017/5/10.
 */
public class ATN {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(null==l1) return l2;
        ListNode root = l1;
        while(true){
            if(null != l2) {
                l1.val += l2.val;
                l2 = l2.next;
            }
            if(l1.val>9) {
                l1.val -= 10;
                if(null==l1.next) l1.next = new ListNode(1);
                else l1.next.val++;
            }
            if(null == l1.next) {
                if(null == l2) break;
                l1.next = new ListNode(0);
            }
            l1 = l1.next;
        }
        return root;
    }
}
