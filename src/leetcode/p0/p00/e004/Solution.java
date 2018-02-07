package leetcode.p0.p00.e004;

/**
 *
 * Created by admin on 2017/5/11.
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] longer,shorter;
        int nl, ns, cl, cs, vl, vs, left, right, total, half;
        double mid;
        if(nums1.length<nums2.length) {
            longer = nums2;
            shorter = nums1;
        } else {
            longer = nums1;
            shorter = nums2;
        }
        nl = longer.length; ns = shorter.length;
        total = nl + ns;
        half = total/2;
        if(0==ns) return total%2>0 ? longer[half] : (double)(longer[half-1] + longer[half])/2;
        left = 0; right = ns;
        while (true) {
            cs = (left + right)/2; cl = half - cs;
            if(0==cs) {
                if(shorter[cs] < longer[cl-1]) {
                    cs++; cl--;
                }
                break;
            }
            if(shorter[cs-1] > longer[cl]) right = cs;
            else if(shorter[cs] < longer[cl-1]) {
                if(left==cs){
                    cs++; cl--;
                    break;
                }
                else left = cs;
            }
            else break;
        }
        if(nl==cl) return (double)(shorter[0] + longer[nl-1])/2;
        if(ns==cs) mid = longer[cl];
        else mid = Math.min(shorter[cs], longer[cl]);
        if(total%2==0) {
            if(0==cl) return (double)(shorter[ns-1] + longer[0])/2;
            if(0==cs) mid = (longer[cl-1] + mid)/2;
            else mid = (Math.max(shorter[cs-1], longer[cl-1]) + mid)/2;
        }
        return mid;
    }
}
