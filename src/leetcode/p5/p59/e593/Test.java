package leetcode.p5.p59.e593;

import java.util.Arrays;

/**
 *
 * Created by admin on 2017/6/25.
 */
public class Test {
    public static void test() {
        test(new int[]{0,0}, new int[]{2,2}, new int[]{-1,2}, new int[]{1,3});
        test(new int[]{0,0}, new int[]{2,1}, new int[]{-1,2}, new int[]{1,3});
        test(new int[]{0,0}, new int[]{0,1}, new int[]{1,0}, new int[]{1,1});
        test(new int[]{0,0}, new int[]{0,0}, new int[]{0,0}, new int[]{0,0});
    }
    static void test(int[] p1, int[] p2, int[] p3, int[] p4) {
        System.out.print("Do points: " + Arrays.toString(p1)+ Arrays.toString(p2)+ Arrays.toString(p3)+ Arrays.toString(p4));
        System.out.println(" make a squre? " + new Solution().validSquare(p1, p2, p3, p4));
    }
}
