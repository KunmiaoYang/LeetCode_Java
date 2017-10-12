package leetcode.p3.p37.e372;

/**
 *
 * Created by admin on 2017/5/30.
 */
public class Solution1 {
    public int superPow(int a, int[] b) {
        if(null == b || b.length == 0) return 1;
        a %= 1337;
        int result = 1, i = 0, j;
        while (true) {
            for(j = 0; j<b[i]; j++) result = (result*a)%1337;
            if(b.length == ++i) break;
            int square = (result*result) % 1337;
            int eight = (square*square) % 1337;
            eight = (eight*eight) % 1337;
            result = (square*eight) % 1337;
        }
        return result;
    }
}