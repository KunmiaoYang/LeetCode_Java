package leetcode.p0.p00.e004;

/**
 *
 * Created by Kunmiao Yang on 1/24/2018.
 */
public class Test {
    public static void test() {
        int[] a1 = {1,2,3}, a2 = {4,5,6,7,8,9};
        double res = new Solution().findMedianSortedArrays(a1, a2);
        System.out.println("result = " + res);
    }
}
