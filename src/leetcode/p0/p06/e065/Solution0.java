package leetcode.p0.p06.e065;

import java.util.regex.Pattern;

/**
 *
 * Created by kunmiao.yang on 2017/6/19.
 */
public class Solution0 {
    public boolean isNumber(String s) {
        return Pattern.matches("[+-]?(\\d+\\.?\\d*|\\.\\d+)((e|E)[+-]?\\d+)?", s.trim());
    }
}