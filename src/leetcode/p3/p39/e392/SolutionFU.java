package leetcode.p3.p39.e392;

/**
 *
 * Created by admin on 2017/7/5.
 */
public class SolutionFU {
    int[][] indexMap = new int[128][];
    int[] indexEnd = new int[128];
    public SolutionFU(String t) {
        int n = t.length();
        for(int i = 0; i < n; i++) {
            char c = t.charAt(i);
            if(null == indexMap[c]) indexMap[c] = new int[n];
            indexMap[c][indexEnd[c]++] = i;
        }
    }
    public boolean isSubsequence(String s) {
        int start = 0;
        for(char c: s.toCharArray()) {
            int left = 0, right = indexEnd[c] - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if(indexMap[c][mid] < start) left = mid + 1;
                else right = mid;
            }
            if(right < left || indexMap[c][right] < start) return false;
            start = indexMap[c][right] + 1;
        }
        return true;
    }
}