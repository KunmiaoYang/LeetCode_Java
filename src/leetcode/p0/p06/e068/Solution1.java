package leetcode.p0.p06.e068;

import java.util.*;

/**
 * Created by kunmiao.yang on 2017/5/23.
 */
public class Solution1 {
    static final char PAD = '*';
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new LinkedList<>();
        int residual = maxWidth, wordLength, start = 0, nw = 0, spacing, extraSpace;
        for(int i = 0; i<words.length; i++, nw++, residual-=wordLength+1) {
            wordLength = words[i].length();
            if(wordLength>residual) {
                StringBuilder sb = new StringBuilder(maxWidth);
                sb.append(words[start]);
                if(nw>1) {
                    spacing = (residual + nw) / (nw - 1);
                    extraSpace = start + residual + nw - (nw - 1)*spacing + 1;
                    padStringBuilder(sb, spacing + 1, words, start + 1, extraSpace);
                    padStringBuilder(sb, spacing, words, extraSpace, start + nw);
                } else for (int j = -1; j<residual; j++) sb.append(PAD);
                res.add(sb.toString());
                start += nw;
                nw = 0;
                residual = maxWidth;
            }
        }
        if(nw>0) {
            StringBuilder sb = new StringBuilder(maxWidth);
            sb.append(words[start]);
            for(int i = start + 1; i<words.length; i++) sb.append(PAD).append(words[i]);
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