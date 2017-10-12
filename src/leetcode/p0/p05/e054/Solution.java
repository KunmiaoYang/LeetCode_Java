package leetcode.p0.p05.e054;

import java.util.*;
/**
 *
 * Created by kunmiao.yang on 2017/6/12.
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int up = -1, down = matrix.length;
        if(0 == down) return new LinkedList<>();
        int left = -1, right = matrix[0].length;
        List<Integer> res = new ArrayList<>(down * right);
        while (true) {
            if(left + 1 == right) break;
            up++;
            for(int i = left + 1; i < right; i++) res.add(matrix[up][i]);
            if(up + 1 == down) break;
            right--;
            for(int i = up + 1; i < down; i++) res.add(matrix[i][right]);
            if(left + 1 == right) break;
            down--;
            for(int i = right - 1; i > left; i--) res.add(matrix[down][i]);
            if(up + 1 == down) break;
            left++;
            for(int i = down - 1; i > up; i--) res.add(matrix[i][left]);
        }
        return res;
    }
}