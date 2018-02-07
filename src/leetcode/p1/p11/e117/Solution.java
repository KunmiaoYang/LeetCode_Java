package leetcode.p1.p11.e117;

/**
 *
 * Created by Kunmiao Yang on 10/22/2017.
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode dummy = new TreeLinkNode(0), pParent, pChild;
        dummy.next = root;
        while(null != dummy.next) {
            pParent = dummy.next;
            dummy.next = null;
            pChild = dummy;
            while(null != pParent) {
                if(null != pParent.left) {
                    pChild.next = pParent.left;
                    pChild = pChild.next;
                }
                if(null != pParent.right) {
                    pChild.next = pParent.right;
                    pChild = pChild.next;
                }
                pParent = pParent.next;
            }
        }
    }
}