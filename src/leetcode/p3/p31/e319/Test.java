package leetcode.p3.p31.e319;

/**
 *
 * Created by kunmiao.yang on 2017/6/26.
 */
public class Test {
    public static void test() {
        for(int i = 1; i < 100; i++) test(i);
    }
    public static void test(int n) {
        System.out.println(n + " bulbs: " + new Solution().bulbSwitch(n) + " is on.");
    }
}
