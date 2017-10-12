package leetcode.p0.p00.e004;

/**
 *
 * Created by kunmiao.yang on 2017/5/11.
 */
public class Solution0 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(1 > nums1.length) return findMedianSortedArrays(nums2);
        if(1 > nums2.length) return findMedianSortedArrays(nums1);
        int len = nums1.length + nums2.length, half = len/2 - 1,
                p1, p2, l1, r1, l2, r2;
        double vl, vr, pivot;
        l1 = -1; l2 = -1;
        r1 = nums1.length - 1; r2 = nums2.length - 1;
        vl = Math.min(nums1[0], nums2[0]);
        vr = Math.max(nums1[r1], nums2[r2]);
        while (true) {
            pivot = (vl + vr) / 2;
            p1 = findLargestPosition(nums1, pivot, l1, r1);
            p2 = findLargestPosition(nums2, pivot, l2, r2);
            int diff = half - p1 -p2;
            if(1 < diff) {
                vl = pivot; l1 = p1; l2 = p2;
            } else if(0 < diff) {
                break;
            } else {
                vr = pivot; r1 = p1; r2 = p2;
            }
        }
        if(p1<nums1.length-1) vr = p2<nums2.length-1? Math.min(nums1[p1+1], nums2[p2+1]) : nums1[p1+1];
        else vr = nums2[p2+1];
        if(len%2>0) return vr;
        if(p1>-1) vl = p2>-1? Math.max(nums1[p1], nums2[p2]) : nums1[p1];
        else vl = nums2[p2];
        return (vl + vr) /2;
    }

    public double findMedianSortedArrays(int[] nums) {
        if(1 > nums.length) return 0;
        int midIndex = nums.length/2;
        return nums.length%2>0? nums[midIndex] : (double)(nums[midIndex-1] + nums[midIndex]) / 2;
    }

    public int findLargestPosition(int[] nums, double bound, int l, int r) {
        if(r-l < 2) return nums[r] > bound ? l : r;
        int p = (l + r)/2;
        if(nums[p] > bound) return findLargestPosition(nums, bound, l, p);
        else return findLargestPosition(nums, bound, p, r);
    }
}
