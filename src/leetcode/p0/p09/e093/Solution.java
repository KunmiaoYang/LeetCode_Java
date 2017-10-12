package leetcode.p0.p09.e093;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/6/1.
 */
public class Solution {
    int n;
    public List<String> restoreIpAddresses(String s) {
        List<String> ipList = new LinkedList<>();
        n = s.length();
        restoreIpAddresses(ipList, new LinkedList<>(), s, 0, 4);
        return ipList;
    }
    void restoreIpAddresses(List<String> ipList, Deque<String> exist, String s, int p, int depth) {
        if(0 == depth && p == n) {
            StringBuilder sb = new StringBuilder();
            for(String ip: exist) sb.append('.').append(ip);
            ipList.add(sb.toString().substring(1));
        } else if(0<depth && p<n) for(int i=p+1, num=s.charAt(p)-'0'; num<256; num=num*10+(s.charAt(i++)-'0')) {
            if (i > n - 3*depth + 2) {
                exist.add(s.substring(p, i));
                restoreIpAddresses(ipList, exist, s, i, depth - 1);
                exist.pollLast();
            }
            if(0 == num || i == n ) break;
        }
    }
}