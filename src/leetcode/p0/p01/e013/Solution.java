package leetcode.p0.p01.e013;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/5/18.
 */
public class Solution {
    static int[] map = new int[128];
    {
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
    }
    public int romanToInt(String s) {
        int n = s.length(), prevDigit = 0, res = 0;
        for(int i = n-1; i>-1; i--) {
            int digit = 0;
            digit = map[s.charAt(i)];
            if(digit<prevDigit) res -= digit;
            else res += digit;
            prevDigit = digit;
        }
        return res;
    }
}
