package leetcode.p0.p00.e008;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by kunmiao.yang on 2017/5/15.
 */
public class Solution0 {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        long res = 0;
        int i = 0;
        boolean isMinus;
        HashSet<Character> operators = new HashSet<>(Arrays.asList('+', '-'));
        LinkedList<Integer> opIndices = new LinkedList<>();
        while (i<chars.length && (chars[i]<'0'|| chars[i]>'9')) {
            if(operators.contains(chars[i])) opIndices.push(i);
            i++;
        }
        int opCounts = opIndices.size();
        if(opCounts>0) {
            int opIndex = opIndices.get(0);
            if(opIndex+1==i) {
                if(opCounts>1 && 1+opIndices.get(1)==opIndex) return 0;
                isMinus = '-'==chars[i-1];
            } else return 0;
//                int j = opIndex + 1;
//                while (j<i && ' '==chars[j]) j++;
//                if(j==i) return 0;
//            }
        }
        isMinus = i>0 && '-'==chars[i-1];
        while (i<chars.length && chars[i]<='9'&& chars[i]>='0') res = res*10 + chars[i++] - '0';
        res = isMinus? -res: res;
        if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(res< Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) res;
    }
}
