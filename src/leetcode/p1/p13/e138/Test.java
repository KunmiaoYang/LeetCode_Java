package leetcode.p1.p13.e138;

/**
 *
 * Created by Kunmiao Yang on 9/20/2017.
 */
public class Test {
    public static void test() {
        RandomListNode r1 = new RandomListNode(1),
                r2 = new RandomListNode(2);
        r1.next = r2;
        r1.random = r2;
        r2.random = r2;
        RandomListNode copy = new Solution().copyRandomList(r1);
        System.out.println("Origin:");
        printRandomList(r1);
        System.out.println("Copy:");
        printRandomList(copy);
    }
    public static void test1() {
        RandomListNode r1 = new RandomListNode(1),
                r2 = new RandomListNode(2),
                r3 = new RandomListNode(3),
                r4 = new RandomListNode(4),
                r5 = new RandomListNode(5),
                r6 = new RandomListNode(6),
                r7 = new RandomListNode(7);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        r5.next = r6;
        r6.next = r7;
        r1.random = r3;
        r2.random = r4;
        r3.random = r5;
        r4.random = r6;
        r5.random = r7;
        r6.random = r1;
        r7.random = r2;
        RandomListNode copy = new Solution().copyRandomList(r1);
        System.out.println("Origin:");
        printRandomList(r1);
        System.out.println("Copy:");
        printRandomList(copy);
    }
    public static void printRandomList(RandomListNode head) {
        for (RandomListNode node = head; null != node; node = node.next)
            System.out.print("[" + node.label + ": " + (null == node.random ? "N/A" : node.random.label) + "]\t");
        System.out.println();
    }
}
