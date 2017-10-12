package algorithms.p1.p18.e187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * Created by kunmiao.yang on 2017/6/12.
 */
public class Solution0 {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> existSequences = new HashSet<>(), res = new HashSet<>();
        char[] chars = s.toCharArray();
        int n = chars.length - 9;
        for(int i = 0; i < n; i++) {
            String sequence = new String(chars, i, 10);
            if(existSequences.contains(sequence)) res.add(sequence);
            else existSequences.add(sequence);
        }
        return new ArrayList<>(res);
    }
}