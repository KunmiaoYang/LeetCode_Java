package leetcode.p0.p07.e071;

import java.util.LinkedList;

/**
 *
 * Created by admin on 2017/5/6.
 */
public class Solution {
    public static void main(String[] args) {
        String path = "/../..";
        String simPath = new Solution().simplifyPath(path);
        System.out.println(simPath);
    }

    public String simplifyPath(String path) {
        String[] arrPath = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for(String dir: arrPath) {
            if (".".equals(dir) || "".equals(dir)) ;
            else if("..".equals(dir)) {if(!stack.isEmpty()) stack.pop();}
            else stack.push("/" + dir);
        }

        StringBuffer sb = new StringBuffer();
        for(int i = stack.size() -1; i > -1; i--) sb.append(stack.get(i));
        return sb.length()>0? sb.toString():"/";
    }
}
