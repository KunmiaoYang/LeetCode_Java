package algorithms.p1.p18.e187;

import java.util.*;

/**
 *
 * Created by kunmiao.yang on 2017/6/12.
 */
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<Integer> existSequences = new HashSet<>(), rep = new HashSet<>();
        List<String> res = new LinkedList<>();
        int n = s.length(), sequence = 0, i;
        if(n < 10) return new ArrayList<>();
        for(i = 0; i < 9; i++)
            sequence = (sequence >> 2) | encode(s.charAt(i));
        while (i < n) {
            sequence = (sequence >> 2) | encode(s.charAt(i++));
            if(existSequences.contains(sequence) && rep.add(sequence)) res.add(s.substring(i-10, i));
            else existSequences.add(sequence);
        }
        return res;
    }
    private int encode(char c) {
        switch (c) {
            case 'A': return 0;
            case 'C': return 0b0100_0000_0000_0000_0000;
            case 'G': return 0b1000_0000_0000_0000_0000;
            case 'T': return 0b1100_0000_0000_0000_0000;
        }
        return -1;
    }
}