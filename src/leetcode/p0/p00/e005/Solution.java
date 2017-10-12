package leetcode.p0.p00.e005;

/**
 *
 * Created by kunmiao.yang on 2017/5/12.
 */
public class Solution {
    static final char MARKER = '#';
    public String longestPalindrome(String s) {
        int n0 = s.length(), n = 2*n0-1;
        if(n0<2) return s;
        char[] chars = new char[n];
        chars[0] = s.charAt(0);
        for(int i = 1, j = 1; i<n0; i++, j+=2) {
            chars[j] = MARKER;
            chars[j+1] = s.charAt(i);
        }

        int pivot = 0, maxPivot = 0, maxRadius = 0;
        int[] coverages = new int[n];
        for(int i = 0; i<n && coverages[pivot]<n; i++) {
            int j, k, radius;
            if(i<coverages[pivot]) {
                int imgI = 2*pivot - i;
                coverages[i] = 2*(i - pivot) + coverages[imgI];
                if(coverages[i] < coverages[pivot]) continue;
                coverages[i] = coverages[pivot];
                j = coverages[i] + 2;
                k = 2*i - coverages[i] -2;
            } else {
                coverages[i] = i;
                if(i%2>0) {j = i + 1; k = i - 1;}
                else {j = i + 2; k = i - 2;}
            }

            while (-1<k && j<n && chars[j]==chars[k]) {j+=2; k-=2;}
            j-=2;

            if(coverages[i]<j) coverages[i] = j;
            pivot = i;
            radius = coverages[i] - i;
            if(radius>maxRadius) {
                maxPivot = i;
                maxRadius = radius;
            }
        }

        return s.substring((maxPivot - maxRadius)/2, (maxPivot + maxRadius)/2 + 1);
    }
}