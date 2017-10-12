package leetcode.p3.p30.e301;

import java.util.List;

/**
 *
 * Created by admin on 2017/7/4.
 */
public class Test {
    public static void test() {
        test(")t))()()bo)");
        test("(((()(()");
        test("())(()");
        test("())(())");
        test("()k)))");
        test("(((k()((");
        test("n");
        test("a)b(c");
        test("a)(b)c(");
        test("()()()");
        test("((()()()");
        test("()()()))");
        test("()())()");
        test("(a)())()");
        test(")(");
    }
    static void test(String s) {
        List<String> res;
        System.out.print("Input: \"" + s);
        res = new Solution().removeInvalidParentheses(s);
        System.out.print("\"\tResult: [");
        for(String str: res) System.out.print("\"" + str +"\" ");
        System.out.println("]");
    }
}
