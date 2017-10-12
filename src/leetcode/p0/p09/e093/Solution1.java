package leetcode.p0.p09.e093;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/1.
 */
public class Solution1 {
    int n;
    public List<String> restoreIpAddresses(String s) {
        List<String> ipList = new LinkedList<>();
        n = s.length();
        restoreIpAddresses(ipList, new LinkedList<>(), s, 0, 4);
        return ipList;
    }
    void restoreIpAddresses(List<String> ipList, Deque<String> exist, String s, int p, int depth) {
        int num = 0;
        if(1 == depth) {
            if( p == n || p + 3 < n || (s.charAt(p) == '0' && p + 1 < n)) return;
            String last = s.substring(p);
            if(Integer.parseInt(last)>255) return;
            StringBuilder sb = new StringBuilder();
            for(String ip: exist) sb.append(ip).append('.');
            sb.append(last);
            ipList.add(sb.toString());
        } else for(int i = p; i<n && i<p+3; i++) {
            num = num*10 + (s.charAt(i) - '0');
            if(num < 256) {
                if (n-3*depth+1 < i) {
                    exist.add(s.substring(p, i+1));
                    restoreIpAddresses(ipList, exist, s, i+1, depth-1);
                    exist.pollLast();
                }
                if(0 == num) break;
            } else break;
        }
    }
}