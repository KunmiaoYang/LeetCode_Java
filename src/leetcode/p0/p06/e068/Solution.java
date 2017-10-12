package leetcode.p0.p06.e068;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution {
    static final char PAD = ' ';
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new LinkedList<>();
        String[] line = new String[words.length];
        int residual = maxWidth, wordLength, nw = 0, spacing, extraSpace;
        for(String word: words) {
            wordLength = word.length();
            if(wordLength>residual) {
                StringBuilder sb = new StringBuilder(maxWidth);
                sb.append(line[0]);
                if(nw>1) {
                    spacing = (residual + nw) / (nw - 1);
                    extraSpace = residual + nw - (nw - 1)*spacing + 1;
                    padStringBuilder(sb, spacing + 1, line, 1, extraSpace);
                    padStringBuilder(sb, spacing, line, extraSpace, nw);
                } else for (int i = -1; i<residual; i++) sb.append(PAD);
                res.add(sb.toString());
                nw = 0;
                residual = maxWidth;
            }
            line[nw++] = word;
            residual-=wordLength+1;
        }
        if(nw>0) {
            StringBuilder sb = new StringBuilder(maxWidth);
            sb.append(line[0]);
            for(int i = 1; i<nw; i++) sb.append(PAD).append(line[i]);
            for (int i = -1; i<residual; i++) sb.append(PAD);
            res.add(sb.toString());
        }
        return res;
    }
    public void padStringBuilder(StringBuilder sb, int spacing, String[] words, int beg, int end) {
        for(int i = beg; i<end; i++) {
            for(int j = 0; j<spacing; j++) sb.append(PAD);
            sb.append(words[i]);
        }
    }
}
