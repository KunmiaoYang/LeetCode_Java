package leetcode.p0.p07.e073;

import java.util.HashSet;

/**
 * Created by kunmiao.yang on 2017/5/16.
 */
public class Solution0 {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroCol = new HashSet<>();
        for(int[] row: matrix) {
            boolean existZero = false;
            for(int i = 0; i<row.length; i++) {
                if(0 == row[i]) {
                    existZero = true;
                    zeroCol.add(i);
                }
            }
            if(existZero) for(int i = 0; i<row.length; i++) row[i] = 0;
        }
        for(int[] row: matrix) for(Integer i: zeroCol) row[i] = 0;
    }
}