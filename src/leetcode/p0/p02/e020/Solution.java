package leetcode.p0.p02.e020;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/19.
 */
public class Solution {
    public boolean isValid(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int check = 0;
        for(char c: s.toCharArray()) {
            try {
                switch (c) {
                    case '(': stack.push(-1); break;
                    case '[': stack.push(-2); break;
                    case '{': stack.push(-3); break;
                    case ')': check = stack.pop() + 1; break;
                    case ']': check = stack.pop() + 2; break;
                    case '}': check = stack.pop() + 3; break;
                    default : check = 0;
                }
                if(check != 0) return false;
            } catch (RuntimeException e) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}