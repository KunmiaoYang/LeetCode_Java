package leetcode.p5.p59.e593;

/**
 *
 * Created by admin on 2017/6/25.
 */
public class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] edge1, edge2, hypt1, hypt2 = p1;
        minus(p2, p2, p1);
        minus(p3, p3, p1);
        minus(p4, p4, p1);
        if(0 == p2[0] && 0 == p2[1]) return false;
        if(product(p2, p3) == 0) {
            edge1 = p2;
            edge2 = p3;
            hypt1 = p4;
        } else if(product(p2, p4) == 0) {
            edge1 = p2;
            edge2 = p4;
            hypt1 = p3;
        } else if(product(p3, p4) == 0) {
            edge1 = p3;
            edge2 = p4;
            hypt1 = p2;
        } else return false;
        minus(hypt2, edge1, edge2);
        return edge1[0] + edge2[0] == hypt1[0] && edge1[1] + edge2[1] == hypt1[1] && product(hypt1, hypt2) == 0;
    }
    void minus(int[] res, int[] v1, int[] v2) {
        res[0] = v1[0] - v2[0];
        res[1] = v1[1] - v2[1];
    }
    int product(int[] v1, int[] v2) {
        return v1[0] * v2[0] + v1[1] * v2[1];
    }
}