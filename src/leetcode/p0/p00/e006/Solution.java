package leetcode.p0.p00.e006;

/**
 * Created by admin on 2017/5/13.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(numRows<2) return s;
        char[] chars = s.toCharArray();
        int interRow = numRows-2, period = numRows+interRow, j;
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for(int i = 0; i<numRows; i++) stringBuilders[i] = new StringBuilder();
        for(int i = 0; i<chars.length; i++) {
            j = i%period;
            if(j<numRows) stringBuilders[j].append(chars[i]);
            else stringBuilders[period-j].append(chars[i]);
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb: stringBuilders) res.append(sb);
        return res.toString();
    }
}