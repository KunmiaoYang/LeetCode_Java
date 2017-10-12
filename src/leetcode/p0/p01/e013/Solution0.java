package leetcode.p0.p01.e013;

import java.util.HashMap;

/**
 * Created by kunmiao.yang on 2017/5/18.
 */
public class Solution0 {
    static HashMap<Character, Integer> digitMap = new HashMap<>(50);
    {
        digitMap.put('I', 1);
        digitMap.put('V', 5);
        digitMap.put('X', 10);
        digitMap.put('L', 50);
        digitMap.put('C', 100);
        digitMap.put('D', 500);
        digitMap.put('M', 1000);
    }
    public int romanToInt(String s) {
        int n = s.length(), prevDigit = 0, res = 0;
        for(int i = n-1; i>-1; i--) {
            int digit = 0;
            digit = digitMap.get(s.charAt(i));
            if(digit<prevDigit) res -= digit;
            else res += digit;
            prevDigit = digit;
        }
        return res;
    }
}
