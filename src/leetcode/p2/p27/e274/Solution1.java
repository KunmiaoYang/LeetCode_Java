package leetcode.p2.p27.e274;

/**
 * Created by kunmiao.yang on 2017/5/22.
 */
public class Solution1 {
    public int hIndex(int[] citations) {
        int n = citations.length, count = 0, citation = n;
        int[] buckets = new int[n+1];
        for(int i: citations) {
            if(i>n) buckets[n]++;
            else buckets[i]++;
        }
        while (citation>-1) {
            count += buckets[citation];
            if(count<citation) citation--;
            else break;
        }
        return citation;
    }
}