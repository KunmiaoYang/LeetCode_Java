package leetcode.p4.p48.e482;

/**
 *
 * Created by admin on 2017/6/4.
 */
public class Test {
    public static void test() {
        System.out.println("result = " + new Solution().licenseKeyFormatting("2", 2));
        System.out.println("result = " + new Solution().licenseKeyFormatting("r", 1));
        System.out.println("result = " + new Solution().licenseKeyFormatting("----", 3));
        System.out.println("result = " + new Solution().licenseKeyFormatting("-abc", 1));
        System.out.println("result = " + new Solution().licenseKeyFormatting("2-4A0r7-4k", 4));
        System.out.println("result = " + new Solution().licenseKeyFormatting("2-4A0r7-4k", 3));
        System.out.println("result = " + new Solution().licenseKeyFormatting("--------------2-4a----or7-4kz", 3));
    }
}
